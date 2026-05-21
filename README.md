# Stator Template Mod

This project serves as a template for creating minecraft fabric and neoforge mods using Stator.

This template is based on top of [Jared's Multiloader Template](https://github.com/jaredlll08/MultiLoader-Template).

This project provides a Gradle project template that can compile Minecraft mods for multiple modloaders using a common project for the sources. This project does not require any third party libraries or dependencies. If you have any questions or want to discuss the project, please join our [Discord](https://discord.myceliummod.network).

## How to Use

All mod classes should be placed in the `common` project under either the `main` or `client` source set. Classes can
still be put unde the `fabric` and `neoforge` projects, but it is discouraged.

Run the `multiloaderJar` task to build the mod. The jar will be located in the parent project's `build/libs` directory.

## License

This project is licensed under the CCO-1.0 license. 

Note that the dependencies of this project are each subject to their own licenses. Please refer to the individual
dependency repositories for their respective licenses.
