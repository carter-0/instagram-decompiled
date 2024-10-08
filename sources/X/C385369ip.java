package X;

import com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache;

/* renamed from: X.9ip  reason: invalid class name and case insensitive filesystem */
public final class C385369ip extends 1P0 {
    public final /* synthetic */ A8Z A00;
    public final /* synthetic */ BrowserLinkshimUrlCache A01;
    public final /* synthetic */ String A02;

    public C385369ip(A8Z a8z, BrowserLinkshimUrlCache browserLinkshimUrlCache, String str) {
        this.A00 = a8z;
        this.A01 = browserLinkshimUrlCache;
        this.A02 = str;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(1704172669);
        AnonymousClass7VL r2 = this.A00.A00;
        r2.A01.requireActivity().runOnUiThread(new C40877Akl(r2));
        AnonymousClass0fD.A0A(1499253539, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1548444519);
        C384559hW r6 = (C384559hW) obj;
        int A0D = AnonymousClass7TG.A0D(r6, -707338019);
        String str = r6.A00;
        if (str != null) {
            if (str.length() == 0) {
                AnonymousClass7VL r2 = this.A00.A00;
                r2.A01.requireActivity().runOnUiThread(new C40877Akl(r2));
            } else {
                C367968rr r0 = this.A01.A00;
                ((C367958rq) r0).A00.put(this.A02, str);
                this.A00.A00(str);
            }
            AnonymousClass0fD.A0A(-1045861217, A0D);
            AnonymousClass0fD.A0A(-800088265, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-307258116, A0D);
        throw A0y;
    }
}
