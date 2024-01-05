# OOLT.VN.20231-18

## Virus Explorer

The VirusExplorer project, developed using JavaFX for the Object-Oriented Programming (OOP) class, is an
application designed to study various viruses' structure and infection process.

## Members

| Student Code | Full name              | Assignment |
|--------------|------------------------|------------|
| 20215072     | Nguyễn Cao Kỳ (Leader) | ________   |
| 20215068     | Hoàng Mạnh Kiên        | ________   |
| 20210494     | Trần Trung Kiên        | ________   |
| 20210531     | Đoàn Văn Linh          | ________   |

## Configuration

To successfully run the project, the following steps should be done (Note: This guidance is made for IntelliJ only).

1. Download the JavaFX version that is compatible with current project's JDK version.
2. In Project Structure (Ctrl + Alt + Shift + S), choose Libraries, then add the path to the lib folder inside the
   unzipped JavaFX directory.

   ![image](https://ibb.co/JvWp8WM)
3. Choose Run &rarr; Edit Configuration..., create a new Application configuration for test.VirusExplorer class. Add VM
   Options in Modify Options... menu. Insert the line below to VM Options.

```
--module-path ${PATH_TO_FX} --add-modules javafx.fxml,javafx.controls,javafx.graphics,javafx.media
```

Replace ${PATH_TO_FX} with the absolute path to the lib folder inside JavaFX directory, or add a Path Variable named
PATH_TO_FX whose value is the path to the mentioned lib folder in Settings.