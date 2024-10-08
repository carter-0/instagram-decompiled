package X;

import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6sR  reason: invalid class name and case insensitive filesystem */
public final class C320476sR extends C270664h6 {
    public final /* synthetic */ C320296s9 A00;

    public final void D3r(H3D h3d) {
        String str;
        0qQ.A0B(h3d, 0);
        C320296s9 r2 = this.A00;
        C320406sK r0 = r2.A08;
        if (r0 == null) {
            str = "clipsProfileTabFetcher";
        } else {
            C320396sJ r1 = r0.A01;
            if (r1 != null) {
                r1.A00 = AnonymousClass05K.A01;
            }
            C321666uY r12 = r2.A02;
            if (r12 == null) {
                str = "clipsProfileTabPerfLogger";
            } else {
                r12.A0T(h3d.A01);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C320476sR(C320296s9 r1) {
        this.A00 = r1;
    }

    public final void D3s() {
        C320296s9 r1 = this.A00;
        UserDetailTabController userDetailTabController = r1.A05;
        if (userDetailTabController != null) {
            userDetailTabController.A0H();
        }
        r1.A05 = null;
    }

    public final void D3t(C52228GJt gJt) {
        String str;
        C320296s9 r3 = this.A00;
        C320406sK r0 = r3.A08;
        if (r0 == null) {
            str = "clipsProfileTabFetcher";
        } else {
            C320396sJ r1 = r0.A01;
            if (r1 != null) {
                r1.A00 = AnonymousClass05K.A00;
            }
            C321666uY r02 = r3.A02;
            if (r02 == null) {
                str = "clipsProfileTabPerfLogger";
            } else {
                r02.A00.A08((String) null);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D3u(C52263GLe gLe) {
        C320406sK r0 = this.A00.A08;
        if (r0 == null) {
            0qQ.A0F("clipsProfileTabFetcher");
            throw AnonymousClass00P.createAndThrow();
        }
        C320396sJ r1 = r0.A01;
        if (r1 != null) {
            r1.A00 = AnonymousClass05K.A0C;
        }
    }
}
