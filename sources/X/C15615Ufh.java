package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Ufh  reason: case insensitive filesystem */
public final class C15615Ufh extends 1P0 {
    public final int A00;
    public final /* synthetic */ C15381Ube A01;

    public C15615Ufh(C15381Ube ube, int i) {
        this.A01 = ube;
        this.A00 = i;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1286135897);
        C18507Vt4 A012 = C15381Ube.A01(this.A01);
        A012.A05 = true;
        A012.A06.A04 = null;
        C18507Vt4.A00(A012);
        AnonymousClass0fD.A0A(414525538, A03);
    }

    public final void onFailInBackground(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(1163301947);
        C15381Ube ube = this.A01;
        ube.A0Y.post(new C20222WnM(this, ube));
        AnonymousClass0fD.A0A(-1301454702, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-358330757);
        C18806W2y.A04(this.A01.A0c, "INFO_REQUEST_START", this.A00);
        AnonymousClass0fD.A0A(-402148847, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1034783966);
        CGD cgd = (CGD) obj;
        int A032 = AnonymousClass0fD.A03(514840922);
        0qQ.A0B(cgd, 0);
        C15381Ube ube = this.A01;
        C18507Vt4 A012 = C15381Ube.A01(ube);
        C18023Vjz vjz = new C18023Vjz(A012.A01);
        vjz.A0C = cgd.A07;
        vjz.A01 = Boolean.valueOf(cgd.A0B);
        vjz.A0A = Integer.valueOf(cgd.A01);
        vjz.A0B = cgd.A06;
        vjz.A08 = Integer.valueOf(cgd.A00);
        vjz.A02 = Boolean.valueOf(cgd.A0C);
        vjz.A06 = Boolean.valueOf(cgd.A0F);
        vjz.A04 = Boolean.valueOf(cgd.A0E);
        Hashtag A002 = vjz.A00();
        A012.A01 = A002;
        C16742V3z v3z = A012.A06;
        0qQ.A0B(A002, 0);
        v3z.A01 = A002;
        v3z.A04 = cgd.A0A;
        v3z.A03 = cgd.A05;
        v3z.A05 = cgd.A0G;
        A012.A02 = cgd.A03;
        A012.A03 = cgd.A04;
        A012.A04 = cgd.A0D;
        A012.A05 = true;
        C18507Vt4.A00(A012);
        C49659F0q f0q = ube.A0H;
        if (f0q == null) {
            0qQ.A0F("actionBarHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        Hashtag hashtag = C15381Ube.A01(ube).A01;
        0qQ.A0B(hashtag, 0);
        f0q.A00 = hashtag;
        AnonymousClass0fD.A0A(2130376823, A032);
        AnonymousClass0fD.A0A(1191623403, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(320744312);
        int A032 = AnonymousClass0fD.A03(1736168976);
        C15381Ube ube = this.A01;
        ube.A0Y.post(new C20223WnN(this, ube));
        AnonymousClass0fD.A0A(1434773005, A032);
        AnonymousClass0fD.A0A(1339894054, A03);
    }
}
