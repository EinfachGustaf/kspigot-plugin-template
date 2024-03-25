# KSpigot Plugin Template
Because [emmaboecker/kspigot-gradle-template](https://github.com/emmaboecker/kspigot-gradle-template) was archived and isn't up to date we created our own template.

This project is inspired by [emmaboecker/kspigot-gradle-template](https://github.com/emmaboecker/kspigot-gradle-template)

## Version
You can switch between the branches to change the version

## Dependencies
| Dependency                   | Version | Repository    |
|------------------------------|---------|---------------|
| KSpigot (`net.axay:kspigot`) | 1.20.3  | Maven Central |

Version 1.20.3 is not an mistake, this is the version that KSpigot published for Minecraft version 1.20.4.

We are using [paperweight](https://github.com/PaperMC/paperweight) for the Paper dependencies

## How to use
1. Click [**Use this template**](../../generate) at the top.
2. Clone your version.
3. Open the Project in IntelliJ.
4. Make sure you use Java 17
5. Change project name in [**settings.gradle.kts**](/settings.gradle.kts#L1).
6. Change group and version in [**build.gradle.kts**](/build.gradle.kts#L7-L8).
7. Update the plugin.yml in the resources directory

If you need help you can open an issue or you can join our [Discord Server](https://discord.com/invite/qCZw9UeV7h) and open a ticket
