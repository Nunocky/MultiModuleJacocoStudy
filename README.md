# MultiModuleJacocoStudy

マルチモジュール構成の Android Studioプロジェクトで jacocoを使用するサンプル。ユニットテストと androidTestのレポートをマージする。

* gradle: 7.5
* jacoco 0.8.9

## Module Dependency

* app
    * libX
    * libY
    * libZ (uses Robolectric)

## refs

* [Android開発のテストカバー率取得にはこのツールを使い分けると良いという話](https://qiita.com/keidroid/items/adc4f065b84d8a2cd17a)
* [Gradle6系 + Jacoco + マルチモジュール + フルKotlin + Android + Robolectric環境でユニットテストのカバレッジを出す](https://qiita.com/ryo_mm2d/items/e431326f701e74ec49fa)
* [JacocoMerge が Deprecated になったので、JacocoReport でレポートをマージする \- Qiita](https://qiita.com/toastkidjp/items/602ff369be565cbc3acc)
* [GradleでTestタスク実施と同時にJacocoでレポートを出力する \- Qiita](https://qiita.com/oono_yoshi/items/a0aa2fff171683006dbb)
* 