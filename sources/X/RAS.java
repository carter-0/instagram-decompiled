package X;

import com.instagram.common.session.UserSession;
import java.io.File;

public final class RAS extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ 0sL A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAS(UserSession userSession, File file, File file2, 0sL r7) {
        super(433475162, 3, false, false);
        this.A01 = file;
        this.A02 = file2;
        this.A00 = userSession;
        this.A03 = r7;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|(1:6)(1:(2:7|(3:9|(5:13|(3:15|(2:17|66)(2:18|(2:20|65)(1:67))|21)|64|22|(2:60|(1:25))(1:63))|59)))|26|27|(3:28|29|(3:31|32|(1:34)))|37|39|40|(3:44|45|46)|51|(1:58)(1:55)|56|57) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0073 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[SYNTHETIC, Splitter:B:31:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ExcHandler: IOException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:26:0x0073] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.io.File r2 = r13.A01
            java.io.File r7 = r13.A02
            com.instagram.common.session.UserSession r6 = r13.A00
            X.0sL r4 = r13.A03
            X.0r1 r5 = new X.0r1
            r5.<init>()
            r3 = 0
            X.Pxg.A1L(r2)     // Catch:{ IOException | SecurityException -> 0x00b2 }
            java.lang.String r1 = "tmp_video_"
            java.lang.String r0 = ".mp4"
            java.io.File r12 = java.io.File.createTempFile(r1, r0, r2)     // Catch:{ IOException | SecurityException -> 0x00b2 }
            r2 = 0
            org.xmlpull.v1.XmlPullParser r9 = X.Q0K.A00(r6, r7)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            if (r9 != 0) goto L_0x0022
            goto L_0x0073
        L_0x0022:
            int r1 = r9.next()     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            r0 = 1
            if (r1 == r0) goto L_0x0073
            int r1 = r9.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            r0 = 2
            if (r1 != r0) goto L_0x0022
            java.lang.String r1 = "Item"
            java.lang.String r0 = r9.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            if (r0 == 0) goto L_0x0022
            r11 = 0
            int r10 = r9.getAttributeCount()     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            r8 = r3
            r6 = r3
        L_0x0043:
            if (r11 >= r10) goto L_0x0065
            java.lang.String r1 = r9.getAttributeName(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            java.lang.String r0 = "Semantic"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r8 = r9.getAttributeValue(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            goto L_0x0062
        L_0x0056:
            java.lang.String r0 = "Length"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r6 = r9.getAttributeValue(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
        L_0x0062:
            int r11 = r11 + 1
            goto L_0x0043
        L_0x0065:
            java.lang.String r0 = "MotionPhoto"
            boolean r0 = r0.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
            if (r0 == 0) goto L_0x0022
            if (r6 == 0) goto L_0x0073
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0073 }
        L_0x0073:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException | SecurityException -> 0x00b7, IOException | SecurityException -> 0x00b7 }
            r9.<init>(r7)     // Catch:{ IOException | SecurityException -> 0x00b7, IOException | SecurityException -> 0x00b7 }
            java.io.FileOutputStream r6 = X.JTO.A0t(r12)     // Catch:{ IOException | SecurityException -> 0x0096 }
            if (r2 == 0) goto L_0x0097
            long r0 = r7.length()     // Catch:{ IOException | SecurityException -> 0x0097 }
            long r7 = r2.longValue()     // Catch:{ IOException | SecurityException -> 0x0097 }
            long r0 = r0 - r7
            r9.skip(r0)     // Catch:{ IOException | SecurityException -> 0x0097 }
            long r1 = android.os.FileUtils.copy(r9, r6)     // Catch:{ IOException | SecurityException -> 0x0097 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0097
            r0 = 1
            r5.A00 = r0     // Catch:{ IOException | SecurityException -> 0x0097 }
            goto L_0x0097
        L_0x0096:
            r6 = r3
        L_0x0097:
            r1 = 28
            X.Wvs r0 = new X.Wvs
            r0.<init>(r5, r1)
            r9.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a5
        L_0x00a2:
            r0.invoke()
        L_0x00a5:
            if (r6 == 0) goto L_0x00b7
            r1 = 29
            X.Wvs r0 = new X.Wvs
            r0.<init>(r5, r1)
            r6.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00b7
        L_0x00b2:
            r12 = r3
            goto L_0x00b7
        L_0x00b4:
            r0.invoke()
        L_0x00b7:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x00ce
            if (r12 == 0) goto L_0x00ce
            java.lang.String r0 = r12.getPath()
            X.0mb.A08(r0)
        L_0x00c4:
            boolean r0 = r5.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.invoke(r0, r3)
            return
        L_0x00ce:
            r3 = r12
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RAS.run():void");
    }
}
