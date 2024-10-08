package X;

import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mcf.MsysError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.OoR  reason: case insensitive filesystem */
public final class C71646OoR implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AnonymousClass4D7 A02;

    public C71646OoR(String str, AnonymousClass4D7 r2, long j) {
        this.A02 = r2;
        this.A00 = j;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AnonymousClass4D7 r3;
        String str;
        String str2;
        ODB odb = (ODB) obj;
        0qQ.A0B(odb, 0);
        MsysError msysError = odb.A00;
        Map map = odb.A01;
        if (msysError != null || map == null || map.isEmpty()) {
            r3 = this.A02;
            str = new 0eQ(new C66121MCs(msysError, odb.A02));
        } else {
            r3 = this.A02;
            long j = this.A00;
            String str3 = this.A01;
            Object obj2 = map.get(C71122OdG.A06);
            if (obj2 != null) {
                byte[] bArr = (byte[]) obj2;
                0qQ.A0B(bArr, 0);
                String encodeToString = Base64.encodeToString(bArr, 2);
                0qQ.A07(encodeToString);
                Object obj3 = map.get(C71122OdG.A03);
                if (obj3 != null) {
                    byte[] bArr2 = (byte[]) obj3;
                    0qQ.A0B(bArr2, 0);
                    String encodeToString2 = Base64.encodeToString(bArr2, 2);
                    0qQ.A07(encodeToString2);
                    Object obj4 = map.get(C71122OdG.A04);
                    if (obj4 != null) {
                        byte[] bArr3 = (byte[]) obj4;
                        0qQ.A0B(bArr3, 0);
                        String encodeToString3 = Base64.encodeToString(bArr3, 2);
                        0qQ.A07(encodeToString3);
                        Object obj5 = map.get(C71122OdG.A02);
                        if (obj5 != null) {
                            String str4 = (String) obj5;
                            Object obj6 = map.get(C71122OdG.A01);
                            if (obj6 != null) {
                                long A0R = AnonymousClass7TE.A0R(obj6);
                                String str5 = (String) map.get(C71122OdG.A05);
                                int A03 = (int) 0mb.A03(str3);
                                String str6 = C71122OdG.A08;
                                ArrayList arrayList = null;
                                if (map.get(str6) != null) {
                                    Object obj7 = map.get(str6);
                                    if (obj7 != null) {
                                        byte[] bArr4 = (byte[]) obj7;
                                        0qQ.A0B(bArr4, 0);
                                        str2 = Base64.encodeToString(bArr4, 2);
                                        0qQ.A07(str2);
                                    } else {
                                        throw AnonymousClass7TE.A0w("Required value was null.");
                                    }
                                } else {
                                    str2 = null;
                                }
                                String str7 = C71122OdG.A07;
                                if (map.get(str7) != null) {
                                    Object obj8 = map.get(str7);
                                    if (obj8 != null) {
                                        List<Object> list = (List) obj8;
                                        arrayList = AnonymousClass7TG.A0r(list);
                                        for (Object A0R2 : list) {
                                            AnonymousClass7TF.A1M(arrayList, (int) AnonymousClass7TE.A0R(A0R2));
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0w("Required value was null.");
                                    }
                                }
                                str = C66834MdS.A02((C68145N2l) null, Integer.valueOf(A03), str4, encodeToString, encodeToString2, encodeToString3, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3)), str5, str2, arrayList, A0R, j).toString();
                            } else {
                                throw AnonymousClass7TE.A0w("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0w("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0w("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0w("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0w("Required value was null.");
            }
        }
        r3.resumeWith(str);
    }
}
