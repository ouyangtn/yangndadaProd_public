# 羊答答 - AI 答题应用平台

> 作者：程序员红豆
>
> [红豆的博客](https://blog.csdn.net/oyjl__)

## 一、背景

### 1、开发流程

1）第一阶段，开发本地的 `MBTI 性格测试小程序`。熟悉答题应用的开发流程，实战跨端小程序开发。

2）第二阶段，开发 `答题应用平台`。用户可以通过上传题目和自定义打分规则，创建答题应用，供其他用户使用

3）第三阶段，让 AI 为平台赋能，做一个 `AI 智能答题应用平台`。用户只需设定主题，就能通过 AI 生成题目、用 AI 分析用户答案，极大降低创建答题应用的成本。



### 2、优势

本项目除了增删改查，更包含实际业务场景、系统设计优化、企业级解决方案，本项目涉及响应式编程、分库分表、设计模式、性能及稳定性优化的实战，并且结合当下最热门的 AI 技术。

### 3、项目收获

项目开发方法和架构设计：

- 如何拆解复杂业务，从 0 开始设计实现系统？
- 如何快速开发小程序、响应式网站和后端项目？
- 如何巧用 JSON 实现复杂评分策略？
- 如何巧妙利用设计模式来优化代码？
- 如何利用 AI 工具 `CodeGeeX 智能编程助手` 提高开发效率？
- 如何利用 SSE 技术实时推送通知？
- 如何利用 Redis + Caffeine + 分布式锁实现稳定高效的缓存？
- 如何使用 RxJava 多线程提升服务性能？
- 如何实现业务的幂等性保证？
- 如何运用分库分表优化系统？




## 二、核心业务流程

### 1.介绍
AI答题应用平台。 基于 Spring Boot + Redis + ChatGLM AI + RxJava + SSE + Caffeine（+ Vue3 + Arco Design + Pinia）的 AI 答题应用平台。 前台用户可以基于 AI 快速生成应用题目并发布多种答题应用，支持检索和分享应用、在线答题并基于多种评分算法或 AI 得到回答总结。 后台管理员可以审核应用、集中管理整站内容，并进行统计分析。

### 2.软件架构

#### （1）.核心业务流程图 
![image](https://github.com/user-attachments/assets/d2233f4e-b574-44d7-99f2-b2fb3714cd47)

#### （2）.时序图
![image](https://github.com/user-attachments/assets/cb71015f-85f9-41ec-b622-6f50d8fd74a5)


#### （3）.架构设计图 
![image](https://github.com/user-attachments/assets/0c44910b-da1e-4e67-b9d8-a48ddd806ce6)

### 3.技术选型
#### （1）.后端：
- Java Spring Boot开发框架（自制后端万用模板）

- 存储层：MySQL数据库 + Redis缓存

- MyBatis-Plus 及 MyBatisX 自动生成

- Redission 分布式锁

- Caffeine 本地缓存

- 基于ChatGLM 大模型的通用AI能力

- RxJava响应式宽架 + 线程池隔离实战

- SSE 服务端推送

- Shardingsphere分库分表

- 幂等设计 +分布式 ID雪花算法

- 多种设计模式

- 多角度项目优化： 性能、稳定性、成本优化、产品优化等



#### (2).前端：
- Vue 3
- Vue-CLI 脚手架
- Axios 请求库1795841406195384322_0.12435803566849124
- Arco Design 组件库
- 前端工程化：ESLint + Prettier + TypeScript
- 富文本编辑器1795841406195384322_0.4145086381901364
- QRCode.js 二维码生成
- Pinia 状态管理
- OpenAPI 前端代码生成

#### (3).小程序开发
- React
- Taro 跨端开发框架
- Taro UI 组件库


### 4.开发工具
前端 IDE：JetBrains WebStorm

后端 IDE：JetBrains IDEA

CodeGeeX 智能编程助手 微信开发者工具



### 5.项目开发大纲
第一阶段：MBTI 性格测试小程序

第二阶段：Web 答题应用平台

第三阶段：AI 智能答题应用平台

第三阶段：多角度项目优化
- RxJava响应式编程
- AI生成题目优化、AI评分优化
- 分库分表
- 幂等设计
- 线程池隔离
- 统计分析
- 应用分享
  RxJava响应式编程
AI生成题目优化、AI评分优化
分库分表
幂等设计
线程池隔离
统计分析
应用分享

