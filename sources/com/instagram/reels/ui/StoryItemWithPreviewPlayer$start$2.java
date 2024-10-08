package com.instagram.reels.ui;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass3BT;
import X.AnonymousClass3V3;
import X.AnonymousClass3W1;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C254043rq;
import X.C255773uh;
import X.C263414Lx;
import X.C296845qj;
import X.C60340gF;
import com.instagram.model.reels.Reel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$2", f = "StoryItemWithPreviewPlayer.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
public final class StoryItemWithPreviewPlayer$start$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ AnonymousClass3V3 A03;
    public final /* synthetic */ AnonymousClass3W1 A04;
    public final /* synthetic */ AnonymousClass3BT A05;
    public final /* synthetic */ C296845qj A06;
    public final /* synthetic */ C263414Lx A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryItemWithPreviewPlayer$start$2(AnonymousClass0iw r2, AnonymousClass3V3 r3, AnonymousClass3W1 r4, AnonymousClass3BT r5, C296845qj r6, C263414Lx r7, AnonymousClass4D7 r8, int i, boolean z) {
        super(2, r8);
        this.A03 = r3;
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r4;
        this.A08 = z;
        this.A07 = r7;
        this.A02 = r2;
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        AnonymousClass3V3 r2 = this.A03;
        AnonymousClass3BT r4 = this.A05;
        C296845qj r5 = this.A06;
        AnonymousClass3W1 r3 = this.A04;
        boolean z = this.A08;
        return new StoryItemWithPreviewPlayer$start$2(this.A02, r2, r3, r4, r5, this.A07, r12, this.A01, z);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C254043rq r8 = (C254043rq) this.A03;
            AnonymousClass7TH.A0R(r8.A02);
            AnonymousClass3BT r7 = this.A05;
            C296845qj r9 = this.A06;
            C255773uh A002 = r7.A00(r9.A02);
            if (A002 != null) {
                Reel reel = r7.A03;
                AnonymousClass3W1 r4 = this.A04;
                boolean z = this.A08;
                C263414Lx r10 = this.A07;
                AnonymousClass0iw r3 = this.A02;
                this.A00 = 1;
                if (C296845qj.A00(r3, r4, reel, A002, r7, r8, r9, r10, this, z) == r2) {
                    return r2;
                }
            }
            return C60340gF.A00;
        }
        this.A06.A05.A01.A08.A0p(this.A01 + 1);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryItemWithPreviewPlayer$start$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
