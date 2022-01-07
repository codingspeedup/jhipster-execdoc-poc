# jhipster-execdoc-poc

Remark: *this is work in progress*.

Proof of concept for using [execdoc-core](https://github.com/codingspeedup/execdoc-core)
and [execdoc-apps](https://github.com/codingspeedup/execdoc-apps) to build web applications with 
[JHipster](https://www.jhipster.tech/). 

This project reduces the task of creating a running web application from scratch to editing an Excel file and clicking some buttons.

After cloning the repository and executing the class `JHipsterExecdocManager` the following window will appear:


<img src="https://raw.githubusercontent.com/codingspeedup/jhipster-execdoc-poc/main/src/test/resources/readme/dialog.png" width="800" height="270">

Here is a list of the supported functionalities:

| Action                 | Description |
| :---:                  | --- |
| [ Browse... ]          | selects a new blueprint folder (preferably empty) |
| [ re / Create ]        | deletes (if applicable) the folder content and creates a new `_master.xlsx` document inside the blueprint folder |
| [ Open ]               | opens the generated Excel template file (this is OS dependent) |
| [ Normalize ]          | Validates, reformats, and fills in the `_master.xlsx` document after it was edited, saved an closed by the user |
| [&nbsp;Generate&nbsp;Prolog&nbsp;KB&nbsp;] | Parses the `_master.xlsx` file and, based on its structure, generates the Prolog facts and rules in a `kb.pl` file inside the blueprint folder. |
| [ tuProlog ]           | Use this to open a Prolog IDE where you can open the `kb.pl` file and explore it |
| [ Generate Project ]   | Generates the web application based on the specifications in `_master.xlsx` (jhipster has to be properly [installed and configured](https://www.jhipster.tech/installation/)). |

Basically, what the last step does is to generate a [JDL specification](https://www.jhipster.tech/jdl/intro) file 
and pass it as an argument to the `jhipster` OS command.

Since the purpose of this brief introduction is not to detail the format and editing of `_master.xlsx` 
a sample can be directly downloaded from 
[here](https://raw.githubusercontent.com/codingspeedup/jhipster-execdoc-poc/main/src/test/resources/readme/_master.xlsx).
It will generate a 
[JDL](https://raw.githubusercontent.com/codingspeedup/jhipster-execdoc-poc/main/src/test/resources/readme/default.jdl)
similar to the one given as an example in [JDL Studio (simple microservice template)](https://start.jhipster.tech/jdl-studio/). 


