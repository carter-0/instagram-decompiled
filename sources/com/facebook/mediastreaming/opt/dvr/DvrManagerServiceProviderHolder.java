package com.facebook.mediastreaming.opt.dvr;

import X.0dV;
import X.XV5;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import java.io.File;

public final class DvrManagerServiceProviderHolder extends ServiceProviderHolder {
    public static final XV5 Companion = new Object();

    public DvrManagerServiceProviderHolder(DvrConfig dvrConfig, TempFileCreator tempFileCreator) {
        this(dvrConfig, tempFileCreator, (CodecMuxerFactory) null);
    }

    private final native void initHybrid(DvrConfig dvrConfig, TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory);

    public final native File getDvrOutputFile();

    public final native int getMuxState();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.XV5] */
    static {
        0dV.A0C("mediastreaming-dvr");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DvrManagerServiceProviderHolder(com.facebook.mediastreaming.opt.dvr.DvrConfig r1, com.facebook.mediastreaming.opt.muxer.TempFileCreator r2, com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory r3) {
        /*
            r0 = this;
            r0.<init>()
            if (r3 != 0) goto L_0x000a
            X.WIW r3 = new X.WIW
            r3.<init>()
        L_0x000a:
            r0.initHybrid(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.dvr.DvrManagerServiceProviderHolder.<init>(com.facebook.mediastreaming.opt.dvr.DvrConfig, com.facebook.mediastreaming.opt.muxer.TempFileCreator, com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory):void");
    }
}
