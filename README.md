# ViewModelApp
## ViewModel
It is an androrid Architectural Component
It is a model for your views such as Activity or Fragment. ViewModels are **lifecycle aware**. Data required for your screen is stored at one place i.e ViewModel.
It may involve formatting that data in a particular format, accumulating data, any logic in displaying this data in your UI. When configuration changes data in Activity retained ViewModel.</br>
![viewmodel-lifecycle](https://user-images.githubusercontent.com/78687005/201010675-20b30bfa-5570-4af4-a016-09b98abf8627.png)
## ViewModelFactory
We can not create ViewModel on our own. We need ViewModelProviders utility provided by Android to create ViewModels.
But ViewModelProviders can only instantiate ViewModels with no arg constructor.
So if I have a ViewModel with multiple arguments, then I need to use a Factory that I can pass to ViewModelProviders to use when an instance of MyViewModel is required.
```kotlin
class MainViewModelFactory(val counter: Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(counter) as T
    }
}
```
