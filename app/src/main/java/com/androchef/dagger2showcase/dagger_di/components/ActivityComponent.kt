package com.androchef.dagger2showcase.dagger_di.components

import com.androchef.dagger2showcase.MainActivity
import com.androchef.dagger2showcase.dagger_di.modules.PetrolEngineModules
import com.androchef.dagger2showcase.dagger_di.modules.WheelsModule
import com.androchef.dagger2showcase.dagger_di.scope.PerActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModules::class]
)
interface ActivityComponent {


    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance @Named("horse_power") horsePower: Int,
            @BindsInstance @Named("engine_capacity") engineCapacity: Int
        ): ActivityComponent
    }

}