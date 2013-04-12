# Spring3入門

# 概要
Sprin3の概要と機能（Di,Aop）について解説。

# 目次
## 自己紹介(3分)
## Spring3概要(5分)
### Springって何？
### Springが提供する機能
## Spring3のはじめ方(5分)
### SpringのHP
### STS
## アノテーションでDi(5分)
### IocとDi
### Diの使いどころ
## サンプルDi
## アノテーションでAop(5分)
### AOPって何？
### AOPの使いどころ
### アノテーションを使ったAOP(5分)
## サンプルアプリケーション
## まとめ(3分)
## 質疑応答(1分)

# 自己紹介
* 名前： 木下　喜雄(きのぴ、きのこ、きのしー、よっちゃん、もじゃ)
* 年齢：31才(1981年会)
* 趣味：クライミング
* 結婚：してます。
* 性格：かなり適当。色々適当。
* twitter:https://twitter.com/yoshio0440
* facebook:https://www.facebook.com/kinoshita.yoshio
* github:https://github.com/yoshio/
* 好きな食べ物：お寿司
* 嫌いな食べ物：カレーに入っているジャガイモ。

# Spring3概要
Springの概要について説明。
## Springって何?
* Java用の軽量フレームワーク
* DiとAopで有名
* 色々なアプリケーションを作れる(スタンドアローン、バッチ、Web)。
* Di,Aop,MVC,ORMなどの機能がある。

## Springが提供する機能
[Spring Framework Runtime](http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/images/spring-overview.png)

* プレゼンテーション層：Spring MVC, Spring Web Flow
* ビジネスロジック層：Di,Aop
* データアクセス層：Spring JDBC, Spring ORM(Hiberate, MyBatis)

# アノテーションでDi
Dipendency Injectionについて説明。

## IocとDi
* SpringはIocをベースとしている。
* SpringはIocの実装方法としてDiを選択
[Ioc](http://ja.wikipedia.org/wiki/%E5%88%B6%E5%BE%A1%E3%81%AE%E5%8F%8D%E8%BB%A2)

## アノテーションを使ったDi
* DiとはIocの実装方法の１つ
* アノテーションを使ったDiはSpring2.5から登場した機能
* それまではxmlで定義
* アノテーションのほうがかなりコードがすっきりする。
* Springはアノテーションを勧めている。

## Diの使いどころ

* コントローラ層
* ビジネスロジック層
* データアクセス層

## サンプルDi

# アノテーションでAop
Aspect Oriented Programmingについて説明

## Aopって
ロジックに関係ないことを共通処理を切り離して、モジュール性を高める。

## 主な使いどころ

* ログ出力
* 例外処理

