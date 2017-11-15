# SpringBootSample
:sushi::sushi::sushi::sushi::sushi:


## Gradle
- プロジェクトの実行
```
gradle front:run
```

- 依存関係の確認
```
gradle -q dependencies front:dependencies
```

## 開発ルール
### パッケージ
- Definitions
    - (service).(product).defs
    - メッセージキー、定数、コード一覧はここ。
- Domain
    - (service).(product).domain
    - Entity、DTO、VOがある。
    - Entity : DBのテーブルに1対1となるオブジェクト。
    - DTO : プロセスまたはネットワークの境界を越えて転送する必要がある
集計データの集合に対する単純なオブジェクト。Formはここ。
    - VO : Integer, String など、単に値を保持するイミュータブルなオブジェクト。
- Repository
    - (service).(product).repository
    - リポジトリはドメインオブジェクトの保存、取得、検索といった操作をカプセル化し、"コレクションオブジェクト"のように振舞う役割を持つ
    - リポジトリにロジックを含めない
    - キャッシュとかDaoとかはここに入れる。
- Service
    - (service).(product).service
    - 全件取得、新規作成、一件削除用のメソッドを作成する
    - @Serviceアノテーションを付ける
    - ビジネスロジックはここ。機能ごとにパッケージを分けるとわかりやすいかも
- Controller
    - (service).(product).controller
    - 基本的にSpringMVCを使ったプログラミングを行う。
    - @Controllerアノテーション(REST APIは@RestController)を付ける。
    - Controllerのメソッドの返り値がそのままシリアライズされ、そのままHTTPレスポンスになる。
- Utilities
    - (service).(product).util


### クラス実装
- inputタグのパラメータを受け取るクラスを実装するとき、下記のようにjavax.validation.constraintsパッケージのクラスを利用すると簡単にバリデーションがおこなえる。

```java
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class InputForm {

	@NotNull //必須
	@Size(min = 1, max = 127) // 文字数
	private String param1;

}

```