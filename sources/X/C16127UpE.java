package X;

/* renamed from: X.UpE  reason: case insensitive filesystem */
public final class C16127UpE extends WZG {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C16127UpE(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void DZN() {
        if (this.A00 != 0) {
            AnonymousClass4O7 r4 = VK6.A00;
            C15286UZq uZq = (C15286UZq) this.A01;
            AnonymousClass4O6 r3 = uZq.A0A;
            if (r3 == null) {
                0qQ.A0F("devicePermissionKitLogger");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r4.A04(AnonymousClass7TE.A0l(uZq.A0m), r3, "SEARCH_NEARBY", this.A02);
            }
        } else {
            C19204WPk wPk = (C19204WPk) ((C19253WRm) this.A01).A01;
            AnonymousClass4O6 r42 = wPk.A03;
            if (r42 != null) {
                VK6.A00.A04(wPk.A0H, r42, "DISCOVERY_MAP", this.A02);
            }
        }
    }

    public final void onCancel() {
        if (this.A00 != 0) {
            AnonymousClass4O7 r4 = VK6.A00;
            C15286UZq uZq = (C15286UZq) this.A01;
            AnonymousClass4O6 r3 = uZq.A0A;
            if (r3 == null) {
                0qQ.A0F("devicePermissionKitLogger");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r4.A02(AnonymousClass7TE.A0l(uZq.A0m), r3, "SEARCH_NEARBY", this.A02);
            }
        } else {
            C19204WPk wPk = (C19204WPk) ((C19253WRm) this.A01).A01;
            AnonymousClass4O6 r42 = wPk.A03;
            if (r42 != null) {
                VK6.A00.A02(wPk.A0H, r42, "DISCOVERY_MAP", this.A02);
            }
        }
    }
}
