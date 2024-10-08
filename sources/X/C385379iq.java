package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Map;

/* renamed from: X.9iq  reason: invalid class name and case insensitive filesystem */
public final class C385379iq extends 1P0 {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C40270AYj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public C385379iq(1Xj r1, C40270AYj aYj, String str, Map map) {
        this.A00 = r1;
        this.A01 = aYj;
        this.A02 = str;
        this.A03 = map;
    }

    public final void onFail(C268654dm r10) {
        int A0D = AnonymousClass7TG.A0D(r10, -634700025);
        C385379iq.super.onFail(r10);
        this.A00.A49(AnonymousClass3YP.NOT_SHARED);
        C40270AYj aYj = this.A01;
        C63394KwF.A00(aYj.A03, "failure", "upsell", aYj.A02, this.A02, this.A03);
        AnonymousClass0fD.A0A(1898726719, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1382293390);
        int A0D = AnonymousClass7TG.A0D(obj, -535657631);
        C385379iq.super.onSuccess(obj);
        this.A00.A49(AnonymousClass3YP.SHARED);
        C40270AYj aYj = this.A01;
        C63394KwF.A00(aYj.A03, RealtimeConstants.SEND_SUCCESS, "upsell", aYj.A02, this.A02, this.A03);
        AnonymousClass0fD.A0A(-2040789221, A0D);
        AnonymousClass0fD.A0A(1467097949, A032);
    }
}
