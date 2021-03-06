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
- 修改mainActivity的代码用上Fragment即可
- 天气详情页面
- 天气详情页面UI编写，以及搜索结果跳转到详情页面
- 天气详情页面接口编写
- 添加搜索天气缓存，下次进来直接跳转至上一次搜索的天气详情
- 天气详情页面添加下拉刷新功能
- 添加侧边栏搜索功能以及细节处理，比如防止重复跳转、侧滑栏关闭关闭键盘
- 修改App图标
- 添加release签名
- 输出可以上架的正式签名包