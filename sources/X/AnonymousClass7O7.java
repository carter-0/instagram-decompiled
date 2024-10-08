package X;

/* renamed from: X.7O7  reason: invalid class name */
public final class AnonymousClass7O7 extends AnonymousClass4AA implements C331837So {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7O7(android.content.Context r5, java.lang.Integer r6, int r7) {
        /*
            r4 = this;
            r3 = 0
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r0 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r0 == 0) goto L_0x0039
            r0 = 2131960874(0x7f13242a, float:1.955843E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x000c:
            int r1 = r6.intValue()
            if (r1 == r3) goto L_0x0035
            r0 = 1
            if (r1 == r0) goto L_0x0031
            r0 = 2
            if (r1 == r0) goto L_0x002d
            if (r2 == 0) goto L_0x002a
            int r0 = r2.intValue()
        L_0x001e:
            java.lang.String r1 = r5.getString(r0)
            X.0qQ.A07(r1)
        L_0x0025:
            r0 = 0
            r4.<init>(r6, r1, r0, r7)
            return
        L_0x002a:
            java.lang.String r1 = ""
            goto L_0x0025
        L_0x002d:
            r0 = 2131973701(0x7f135645, float:1.9584445E38)
            goto L_0x001e
        L_0x0031:
            r0 = 2131973698(0x7f135642, float:1.958444E38)
            goto L_0x001e
        L_0x0035:
            r0 = 2131973699(0x7f135643, float:1.9584441E38)
            goto L_0x001e
        L_0x0039:
            r2 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7O7.<init>(android.content.Context, java.lang.Integer, int):void");
    }

    public final int getType() {
        return 36;
    }

    public final long C7Z() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass7O7 r4 = (AnonymousClass7O7) obj;
        0qQ.A0B(r4, 0);
        if (!0qQ.A0K(this.A03, r4.A03) || !0qQ.A0K(this.A02, r4.A02) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass7O7(Integer num, String str, String str2, int i) {
        0qQ.A0B(num, 3);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = num;
        this.A00 = i;
    }
}
