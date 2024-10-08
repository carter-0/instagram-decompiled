package com.facebook.rsys.cryptocontextfactory.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;

public abstract class CryptoContextFactory {

    public final class CProxy extends CryptoContextFactory {
        public static native CryptoContextHolder createContextHolder(long j, Mailbox mailbox);

        public static native CryptoContextHolder createContextHolderWithAccountSession(long j, AccountSession accountSession);

        public static native CryptoContextFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
