package X;

import android.app.Notification;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.PeK  reason: case insensitive filesystem */
public final class C73528PeK implements 02o {
    public static final C73528PeK A00 = new C73528PeK();

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r13) {
        String str;
        String str2;
        StringBuilder A1A;
        String str3;
        1RA r12 = (1RA) obj;
        if (r12.A07) {
            new 1Fs(C60960kU.A00).A00.cancel((String) null, 1909066919);
        } else {
            String str4 = r12.A05;
            if (str4 != null) {
                A1A = AnonymousClass7TE.A1A();
                A1A.append(AnonymousClass000.A00(2259));
                A1A.append(str4);
            } else if (r12.A08) {
                str3 = "Configuring dogfooding...";
                AnonymousClass9T8 r0 = (AnonymousClass9T8) OYU.A02.getValue();
                r0.A0B(str3);
                Notification A03 = r0.A03();
                0qQ.A07(A03);
                new 1Fs(C60960kU.A00).A00((String) null, 1909066919, A03);
            } else {
                if (r12.A09) {
                    str = "syncing";
                } else {
                    AnonymousClass1R9 r02 = AnonymousClass1R9.A03;
                    int i = r12.A00;
                    if (i == 0 || i == -1) {
                        str = NetInfoModule.CONNECTION_TYPE_NONE;
                    } else {
                        str = String.valueOf(i);
                    }
                }
                if (r12.A04 == AnonymousClass05K.A0C) {
                    str2 = "zero";
                } else {
                    str2 = "paid";
                }
                String format = String.format("%.1f", C66581MXm.A1b(Double.valueOf((((double) r12.A02) / 1024.0d) / 1024.0d), 1));
                0qQ.A07(format);
                String A14 = JTR.A14("%.1f", new Object[]{Double.valueOf((((double) r12.A03) / 1024.0d) / 1024.0d)}, 1);
                A1A = AnonymousClass7TE.A1A();
                A1A.append("Carrier: ");
                A1A.append(str);
                A1A.append(" | Balance: ");
                A1A.append(str2);
                A1A.append("\nImage: ");
                A1A.append(format);
                A1A.append("MB | Video: ");
                A1A.append(A14);
                A1A.append("MB");
            }
            str3 = A1A.toString();
            AnonymousClass9T8 r03 = (AnonymousClass9T8) OYU.A02.getValue();
            r03.A0B(str3);
            Notification A032 = r03.A03();
            0qQ.A07(A032);
            new 1Fs(C60960kU.A00).A00((String) null, 1909066919, A032);
        }
        return C60340gF.A00;
    }
}
