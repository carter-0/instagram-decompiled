package X;

/* renamed from: X.SfO  reason: case insensitive filesystem */
public final class C11727SfO implements C13890TjD {
    public final C13684Tf1 AKu(SJM sjm) {
        String str = sjm.A0Y;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new C22122Xvm(sjm.A0Z);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new C11731SfS();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new C11729SfQ();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new C11730SfR();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new C11732SfT(sjm.A0Z);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new C11735SfW(sjm.A0Z);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new C11733SfU();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new C11734SfV();
                    }
                    break;
            }
        }
        throw AnonymousClass7TF.A0W("Unsupported MIME type: ", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r3.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r3.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Atf(X.SJM r5) {
        /*
            r4 = this;
            java.lang.String r3 = r5.A0Y
            if (r3 == 0) goto L_0x000d
            int r0 = r3.hashCode()
            r2 = 2
            r1 = 1
            switch(r0) {
                case -1351681404: goto L_0x0014;
                case -1248334819: goto L_0x0017;
                case -1026075066: goto L_0x001a;
                case -1004728940: goto L_0x001d;
                case 691401887: goto L_0x0021;
                case 822864842: goto L_0x002a;
                case 1668750253: goto L_0x002e;
                case 1693976202: goto L_0x0031;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "Unsupported MIME type: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r3)
            throw r0
        L_0x0014:
            java.lang.String r0 = "application/dvbsubs"
            goto L_0x0023
        L_0x0017:
            java.lang.String r0 = "application/pgs"
            goto L_0x0023
        L_0x001a:
            java.lang.String r0 = "application/x-mp4-vtt"
            goto L_0x0023
        L_0x001d:
            java.lang.String r0 = "text/vtt"
            goto L_0x0033
        L_0x0021:
            java.lang.String r0 = "application/x-quicktime-tx3g"
        L_0x0023:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000d
            return r2
        L_0x002a:
            java.lang.String r0 = "text/x-ssa"
            goto L_0x0033
        L_0x002e:
            java.lang.String r0 = "application/x-subrip"
            goto L_0x0033
        L_0x0031:
            java.lang.String r0 = "application/ttml+xml"
        L_0x0033:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11727SfO.Atf(X.SJM):int");
    }

    public final boolean Ez6(SJM sjm) {
        String str = sjm.A0Y;
        if (2Ob.A00(str, "text/x-ssa") || 2Ob.A00(str, "text/vtt") || 2Ob.A00(str, "application/x-mp4-vtt") || 2Ob.A00(str, "application/x-subrip") || 2Ob.A00(str, "application/x-quicktime-tx3g") || 2Ob.A00(str, "application/pgs") || 2Ob.A00(str, "application/dvbsubs") || 2Ob.A00(str, "application/ttml+xml")) {
            return true;
        }
        return false;
    }
}
