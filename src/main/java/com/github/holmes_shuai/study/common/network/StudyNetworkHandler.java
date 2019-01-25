package com.github.holmes_shuai.study.common.network;

import com.github.holmes_shuai.study.Study;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class StudyNetworkHandler {
    private static SimpleNetworkWrapper networkWrapper =
            NetworkRegistry.INSTANCE.newSimpleChannel(Study.MODID);
}
