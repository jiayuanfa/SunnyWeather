# SunnyWeather
天气App

- 注册账号
- 申请接口权限
- 准备开发资源
- 搭建项目架构为MVVM架构
- UI控制层
- ViewModel层
- 仓库层
- 本地数据源Model、网络数据源model
- 持久化文件、Webservice
- 创建BaseApplication、全局Context
- 接口Token
- 定义数据模型
- 编写天气API
- 编写Retrofit的构建器，通过BaseUrl,使用了内联函数inline和reified关键字，生成实化方法
- 编写SunnyWeatherNetwork，即统一的API资源请求入口
- 编写Repository仓库类，统一取LiveData数据
- 编写ViewModel类
- 编写UI-XML
- 编写Adapter
- 编写Fragment
- 懒加载
- 监听输入框代码的编写
- 监听ViewModel数据，刷新Rv
- 由于使用到了MaterialDesign的CardView，所有我们要使用设置MaterialDesign的NoActionBarStyle
- 修改ainActivity的代码用上Fragment即可