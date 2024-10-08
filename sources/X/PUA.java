package X;

import android.content.Context;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class PUA implements 1aV {
    public final int A00;
    public final Object A01;
    public final String A02;

    public PUA(Context context, String str, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A01 = context;
            this.A02 = str;
        } else {
            this.A02 = str;
            this.A01 = context;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        0sn A1C;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        C254923tH r9;
        PendingRecipient pendingRecipient;
        User A022;
        C250663lr requiredTreeField;
        C250663lr optionalTreeField;
        Context context;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C250663lr r6 = (C250663lr) obj2;
                if (r6 != null && (requiredTreeField = r6.getRequiredTreeField(0, "xdt__generate_share_url_wrapper(request:$input)", C64.class, -747799946)) != null && (optionalTreeField = requiredTreeField.getOptionalTreeField(0, "share_url_wrapper", C63.class, -1337962279)) != null && optionalTreeField.getRequiredStringField(1, "share_id") != null) {
                    T7O t7o = ((DirectShareSheetFragmentViewModel) this.A01).A0T;
                    String str = this.A02;
                    String requiredStringField = optionalTreeField.getRequiredStringField(1, "share_id");
                    0qQ.A07(requiredStringField);
                    ((C367958rq) t7o.A00).A00.put(str, requiredStringField);
                    return;
                }
                return;
            case 1:
                ((C67195Mjr) obj2).A01(new C72611PCq(((PCQ) this.A01).A0D.A00(), this.A02));
                return;
            case 2:
                C74233PrM prM = (C74233PrM) obj2;
                if (prM instanceof C72176Oxl) {
                    0wb.A07(this.A02, (Throwable) C66996MgU.A01(prM));
                    C59689JTv.A0A((Context) this.A01, "error");
                    return;
                }
                return;
            case 3:
                C257443xP r62 = (C257443xP) obj2;
                0qQ.A0B(r62, 0);
                C69070Ne9 ne9 = (C69070Ne9) this.A01;
                05G r20 = ne9.A04;
                UserSession userSession = ne9.A01;
                String str2 = this.A02;
                if (str2 == null) {
                    str2 = "";
                }
                int i = ne9.A00;
                if (!r62.A06()) {
                    A1C = 0sn.A00;
                } else {
                    A1C = AnonymousClass7TE.A1C();
                    Object A03 = r62.A03();
                    0qQ.A07(A03);
                    C301345z0 r8 = (C301345z0) A03;
                    int length = str2.length();
                    int A04 = C66580MXl.A04(r8);
                    if (length == 0) {
                        A04 = Math.min(A04, i);
                    }
                    for (int i2 = 0; i2 < C66580MXl.A04(r8) && A1C.size() < A04; i2++) {
                        if (!C70116NxW.A00(C66581MXm.A0o(r8.mResultSet, i2, 3)).A02 && r8.mResultSet.getNullableLong(i2, 0) != null) {
                            String string = r8.mResultSet.getString(i2, 9);
                            if (string == null || string.length() == 0) {
                                strArr = new String[0];
                            } else {
                                strArr = DbU.A1b(DbX.A0x(string), 0);
                            }
                            String string2 = r8.mResultSet.getString(i2, 10);
                            if (string2 == null || string2.length() == 0) {
                                strArr2 = new String[0];
                            } else {
                                strArr2 = DbU.A1b(DbX.A0x(string2), 0);
                            }
                            String string3 = r8.mResultSet.getString(i2, 13);
                            if (string3 == null || string3.length() == 0) {
                                strArr3 = new String[0];
                            } else {
                                strArr3 = DbU.A1b(DbX.A0x(string3), 0);
                            }
                            String string4 = r8.mResultSet.getString(i2, 14);
                            if (string4 == null || string4.length() == 0) {
                                strArr4 = new String[0];
                            } else {
                                strArr4 = DbU.A1b(DbX.A0x(string4), 0);
                            }
                            int length2 = strArr4.length;
                            int min = Math.min(length2, Math.min(strArr.length, length2));
                            ArrayList A1C2 = AnonymousClass7TE.A1C();
                            17i A002 = 17h.A00(userSession);
                            for (int i3 = 0; i3 < min; i3++) {
                                if (i3 >= strArr2.length || (A022 = A002.A02(strArr2[i3])) == null) {
                                    Parcelable.Creator creator = PendingRecipient.CREATOR;
                                    pendingRecipient = new PendingRecipient(DbS.A0V(strArr4[i3]), strArr[i3], strArr3[i3]);
                                } else {
                                    pendingRecipient = new PendingRecipient(A022);
                                }
                                A1C2.add(pendingRecipient);
                            }
                            long A042 = DbY.A04(r8.mResultSet.getNullableLong(i2, 0));
                            Long nullableLong = r8.mResultSet.getNullableLong(i2, 1);
                            if (C70093Nx9.A00(r8.mResultSet.getInteger(i2, 2))) {
                                r9 = C254923tH.ACT;
                            } else {
                                r9 = C254923tH.MI;
                            }
                            MsysThreadId msysThreadId = new MsysThreadId(r9, nullableLong, A042);
                            String string5 = r8.mResultSet.getString(i2, 12);
                            String str3 = "";
                            if (string5 == null) {
                                string5 = str3;
                            }
                            MsysThreadId msysThreadId2 = msysThreadId;
                            DirectShareTarget directShareTarget = new DirectShareTarget(msysThreadId2, r8.mResultSet.getNullableBoolean(i2, 17), string5, (List) A1C2, DbX.A01(r8.mResultSet.getNullableInteger(i2, 5)));
                            if (r8.mResultSet.getString(i2, 15) != null) {
                                String A0v = C66580MXl.A0v(r8, i2, 15);
                                if (A0v != null) {
                                    str3 = A0v;
                                }
                                directShareTarget.A02 = new ExtendedImageUrl(str3, -1, -1);
                            }
                            A1C.add(directShareTarget);
                        }
                    }
                }
                r20.Epw(A1C);
                AnonymousClass7TF.A1O(ne9.A03, true);
                return;
            case 4:
                if (!(obj2 instanceof C72176Oxl) && (context = (Context) this.A01) != null) {
                    C59689JTv.A09(context, DbW.A0h(context, this.A02, 2131960309));
                    return;
                }
                return;
            case 5:
                ((AnonymousClass7UH) this.A01).A05(this.A02, true);
                return;
            default:
                if (obj2 instanceof C66990MgO) {
                    AnonymousClass7UH r2 = (AnonymousClass7UH) this.A01;
                    String str4 = this.A02;
                    r2.A05(str4, false);
                    r2.A04(str4, true);
                    return;
                }
                return;
        }
    }

    public PUA(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }
}
