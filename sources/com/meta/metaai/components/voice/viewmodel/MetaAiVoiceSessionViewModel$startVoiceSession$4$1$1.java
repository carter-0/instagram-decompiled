package com.meta.metaai.components.voice.viewmodel;

import X.0eS;
import X.0pq;
import X.0sL;
import X.0sP;
import X.1Hj;
import X.AnonymousClass07Z;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0r6;
import X.AnonymousClass10H;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C53033GhO;
import X.C58033IkQ;
import X.C58114Ime;
import X.C60340gF;
import X.LAB;
import android.content.Context;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1", f = "MetaAiVoiceSessionViewModel.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
public final class MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass07Z A03;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession A04;
    public final /* synthetic */ C53033GhO A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1(Context context, AnonymousClass07Z r3, MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, C53033GhO ghO, AnonymousClass4D7 r6, 0sP r7, long j, boolean z) {
        super(2, r6);
        this.A04 = metaAiRsysSdkRealTimeSession;
        this.A05 = ghO;
        this.A02 = context;
        this.A01 = j;
        this.A03 = r3;
        this.A06 = r7;
        this.A07 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = this.A04;
        C53033GhO ghO = this.A05;
        return new MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1(this.A02, this.A03, metaAiRsysSdkRealTimeSession, ghO, r12, this.A06, this.A01, this.A07);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = this.A04;
            AnonymousClass0eM r1 = metaAiRsysSdkRealTimeSession.A05;
            AnonymousClass0Ud r5 = ((LAB) r1.getValue()).A05;
            AnonymousClass0Ud r2 = ((LAB) r1.getValue()).A04;
            0pq A012 = AnonymousClass10H.A01(new C58114Ime(1, (AnonymousClass4D7) null), (AnonymousClass0r6) metaAiRsysSdkRealTimeSession.A03.getValue(), (AnonymousClass0r6) metaAiRsysSdkRealTimeSession.A04.getValue(), r5, r2);
            C53033GhO ghO = this.A05;
            C58033IkQ ikQ = new C58033IkQ(this.A02, this.A03, ghO, this.A06, this.A01, this.A07);
            this.A00 = 1;
            if (A012.collect(ikQ, this) == r3) {
                return r3;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
