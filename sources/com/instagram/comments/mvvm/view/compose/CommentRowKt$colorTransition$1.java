package com.instagram.comments.mvvm.view.compose;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5RW;
import X.AnonymousClass5b4;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.C60340gF;
import X.GQC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.compose.CommentRowKt$colorTransition$1", f = "CommentRow.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
public final class CommentRowKt$colorTransition$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass5b4 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentRowKt$colorTransition$1(AnonymousClass5b4 r2, AnonymousClass4D7 r3, int i, int i2, long j) {
        super(2, r3);
        this.A04 = r2;
        this.A03 = j;
        this.A02 = i;
        this.A01 = i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.comments.mvvm.view.compose.CommentRowKt$colorTransition$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        return new CommentRowKt$colorTransition$1(this.A04, r9, this.A02, this.A01, this.A03);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.comments.mvvm.view.compose.CommentRowKt$colorTransition$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AnonymousClass5b4 r3 = this.A04;
            AnonymousClass5RW A0N = C51965G9l.A0N(this.A03);
            GQC A002 = GQC.A00(this.A02, this.A01);
            this.A00 = 1;
            if (r3.A03(A002, A0N, r3.A02(), this) == r5) {
                return r5;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentRowKt$colorTransition$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
