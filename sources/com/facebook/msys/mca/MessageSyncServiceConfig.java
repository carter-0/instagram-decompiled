package com.facebook.msys.mca;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

public class MessageSyncServiceConfig {
    public final NativeHolder mNativeHolder;

    public MessageSyncServiceConfig(String str, String str2, AccountSession accountSession, SlimMailbox slimMailbox, MailboxDatabaseConfig mailboxDatabaseConfig, NetworkSession networkSession, DasmConfigCreator dasmConfigCreator, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, String str3, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10) {
        String str4 = str3;
        MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig2 = mailboxMessengerMediaSendManagerConfig;
        DasmConfigCreator dasmConfigCreator2 = dasmConfigCreator;
        NetworkSession networkSession2 = networkSession;
        String str5 = str;
        boolean z11 = z8;
        boolean z12 = z7;
        boolean z13 = z5;
        AccountSession accountSession2 = accountSession;
        boolean z14 = z4;
        String str6 = str2;
        SlimMailbox slimMailbox2 = slimMailbox;
        MailboxDatabaseConfig mailboxDatabaseConfig2 = mailboxDatabaseConfig;
        this.mNativeHolder = initNativeHolder(str5, str6, accountSession2, slimMailbox2, mailboxDatabaseConfig2, networkSession2, dasmConfigCreator2, mailboxMessengerMediaSendManagerConfig2, str4, list, i, true, false, z3, z14, z13, 500, true, 500, z12, z11, 500, z9, z10);
    }

    public static native NativeHolder initNativeHolder(String str, String str2, AccountSession accountSession, SlimMailbox slimMailbox, MailboxDatabaseConfig mailboxDatabaseConfig, NetworkSession networkSession, DasmConfigCreator dasmConfigCreator, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, String str3, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10);
}
