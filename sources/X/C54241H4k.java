package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.List;

/* renamed from: X.H4k  reason: case insensitive filesystem */
public final class C54241H4k extends 1P0 {
    public final C369968vc A00;
    public final /* synthetic */ C55756Hmr A01;

    public C54241H4k(C369968vc r1, C55756Hmr hmr) {
        this.A01 = hmr;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(661256424);
        0f9 AEf = 0wj.A01.AEf("clips_remix_drafts_picker_controller", 817902720);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "Failed to fetch media for Remix");
        AEf.report();
        AnonymousClass0fD.A0A(154126148, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(263978639);
        this.A01.A02.A00(this.A00);
        AnonymousClass0fD.A0A(2069469943, A03);
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(1303041841, AnonymousClass0fD.A03(-13186166));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-886221464);
        1XO r5 = (1XO) obj;
        int A032 = AnonymousClass0fD.A03(501018943);
        0qQ.A0B(r5, 0);
        List list = r5.A06;
        0qQ.A07(list);
        1Xj r1 = (1Xj) 00k.A0O(list, 0);
        if (r1 != null) {
            C51967G9n.A1K(this.A01.A00, r1);
        }
        AnonymousClass0fD.A0A(-795394441, A032);
        AnonymousClass0fD.A0A(1711407223, A03);
    }
}
