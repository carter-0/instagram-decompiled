package X;

/* renamed from: X.7M9  reason: invalid class name */
public final class AnonymousClass7M9 implements 0xZ {
    public final /* synthetic */ AnonymousClass7WK A00;

    public AnonymousClass7M9(AnonymousClass7WK r1) {
        this.A00 = r1;
    }

    public final void onChanged(0xa r6, String str) {
        if (str != null && 00l.A0d(str, "ads_event_sharing_notice_type", false)) {
            AnonymousClass7WK r3 = this.A00;
            String BY8 = ((C333517Zg) r3.A07.invoke()).C6l().BY8();
            if (BY8 != null && new C370818x7(r3.A05).A01(BY8).length() > 0) {
                if (r3.A04.isResumed()) {
                    AnonymousClass7FA r0 = (AnonymousClass7FA) r3.A06.invoke();
                    if (r0 != null) {
                        r0.A05(false);
                        return;
                    }
                    return;
                }
                r3.A03 = true;
            }
        }
    }
}
