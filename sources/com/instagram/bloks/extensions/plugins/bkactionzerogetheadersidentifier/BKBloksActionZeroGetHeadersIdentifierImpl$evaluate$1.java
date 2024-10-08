package com.instagram.bloks.extensions.plugins.bkactionzerogetheadersidentifier;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass3OC;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import com.instagram.zero.main.IgZeroMain;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bloks.extensions.plugins.bkactionzerogetheadersidentifier.BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1", f = "BKBloksActionZeroGetHeadersIdentifierImpl.kt", i = {}, l = {31, 32}, m = "invokeSuspend", n = {}, s = {})
public final class BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1(String str, String str2, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A02 = str;
        this.A01 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.bloks.extensions.plugins.bkactionzerogetheadersidentifier.BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1(this.A02, this.A01, r5);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.bloks.extensions.plugins.bkactionzerogetheadersidentifier.BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        IgZeroMain igZeroMain;
        IgZeroMain igZeroMain2;
        1Hj r4 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            String str = this.A02;
            if (0qQ.A0K(str, "display")) {
                String str2 = this.A01;
                this.A00 = 1;
                if (!(AnonymousClass3OC.A00 == null || (igZeroMain2 = IgZeroMain.A08) == null)) {
                    obj = igZeroMain2.A03(str2, this);
                }
                obj = null;
            } else if (!0qQ.A0K(str, "submit")) {
                return null;
            } else {
                String str3 = this.A01;
                this.A00 = 2;
                if (!(AnonymousClass3OC.A00 == null || (igZeroMain = IgZeroMain.A08) == null)) {
                    obj = igZeroMain.A02(str3, this);
                }
                obj = null;
            }
            if (obj == r4) {
                return r4;
            }
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
