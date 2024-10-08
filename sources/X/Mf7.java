package X;

import android.text.SpannableString;
import com.facebook.instagram.msys.secure.ChildResultSetUtils;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.CQLResultSetImpl;
import com.facebook.msys.mci.JQLResultSet;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Mf7 implements C74549Pwi {
    public final C297675s9 A00;
    public final AuthData A01;

    public Mf7(C297675s9 r2, AuthData authData) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = authData;
    }

    public final String AZc(int i) {
        return this.A00.mResultSet.getString(i, 36);
    }

    public final Long AlG(int i) {
        return C66581MXm.A0q(this.A00.mResultSet, i, 37);
    }

    public final Long AlH(int i) {
        return C66581MXm.A0q(this.A00.mResultSet, i, 38);
    }

    public final SpannableString Ayo(int i) {
        String string = this.A00.mResultSet.getString(i, 35);
        if (string != null) {
            return C66580MXl.A0D(string);
        }
        return null;
    }

    public final int B6h(int i) {
        return this.A00.mResultSet.getInteger(i, 7);
    }

    public final long BKf(int i) {
        return this.A00.mResultSet.getLong(i, 20);
    }

    public final String BKy(int i) {
        return DbX.A0t(this.A00.mResultSet.getNullableLong(i, 29));
    }

    public final String BKz(int i) {
        return this.A00.mResultSet.getString(i, 18);
    }

    public final Long BL0(int i) {
        return this.A00.mResultSet.getNullableLong(i, 31);
    }

    public final Long BLH(int i) {
        CQLResultSet instagramSecureThreadListMessageAdditionalInfoFromInstagramSecureThreadListNative;
        C297675s9 r1 = this.A00;
        ChildResultSetUtils childResultSetUtils = ChildResultSetUtils.sInstance;
        CQLResultSet cQLResultSet = r1.mResultSet;
        if (cQLResultSet instanceof JQLResultSet) {
            instagramSecureThreadListMessageAdditionalInfoFromInstagramSecureThreadListNative = ((JQLResultSet) cQLResultSet).A02("secure_thread_list_message_additional_info", i);
        } else {
            instagramSecureThreadListMessageAdditionalInfoFromInstagramSecureThreadListNative = ChildResultSetUtils.getInstagramSecureThreadListMessageAdditionalInfoFromInstagramSecureThreadListNative((CQLResultSetImpl) cQLResultSet, i);
        }
        if (instagramSecureThreadListMessageAdditionalInfoFromInstagramSecureThreadListNative != null) {
            return instagramSecureThreadListMessageAdditionalInfoFromInstagramSecureThreadListNative.getNullableLong(0, 1);
        }
        return null;
    }

    public final List BS6(int i) {
        CQLResultSet instagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative;
        C297675s9 r1 = this.A00;
        ChildResultSetUtils childResultSetUtils = ChildResultSetUtils.sInstance;
        CQLResultSet cQLResultSet = r1.mResultSet;
        if (cQLResultSet instanceof JQLResultSet) {
            instagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative = ((JQLResultSet) cQLResultSet).A02("secure_thread_list_message_text_list", i);
        } else {
            instagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative = ChildResultSetUtils.getInstagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative((CQLResultSetImpl) cQLResultSet, i);
        }
        if (instagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative == null) {
            return 0sn.A00;
        }
        2HY A0C = C229632nm.A0C(0, instagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative.getCount());
        ArrayList A1C = AnonymousClass7TE.A1C();
        0sh it = A0C.iterator();
        while (it.hasNext()) {
            String string = instagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative.getString(it.A00(), 2);
            if (string == null) {
                string = "";
            }
            A1C.add(new C70470O7v(string));
        }
        return A1C;
    }

    public final Integer BUH(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 33);
    }

    public final int BYA(int i) {
        return this.A00.mResultSet.getInteger(i, 11);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.NAs, X.5z0] */
    public final Map Bam(17i r10, int i) {
        CQLResultSet instagramSecureThreadListParticipantListFromInstagramSecureThreadListNative;
        C297675s9 r1 = this.A00;
        ChildResultSetUtils childResultSetUtils = ChildResultSetUtils.sInstance;
        CQLResultSet cQLResultSet = r1.mResultSet;
        if (cQLResultSet instanceof JQLResultSet) {
            instagramSecureThreadListParticipantListFromInstagramSecureThreadListNative = ((JQLResultSet) cQLResultSet).A02("secure_thread_list_participant_list", i);
        } else {
            instagramSecureThreadListParticipantListFromInstagramSecureThreadListNative = ChildResultSetUtils.getInstagramSecureThreadListParticipantListFromInstagramSecureThreadListNative((CQLResultSetImpl) cQLResultSet, i);
        }
        if (instagramSecureThreadListParticipantListFromInstagramSecureThreadListNative == null) {
            return null;
        }
        PCN pcn = new PCN(new C301345z0(instagramSecureThreadListParticipantListFromInstagramSecureThreadListNative));
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        C68331NAs nAs = pcn.A00;
        int A04 = C66580MXl.A04(nAs);
        for (int i2 = 0; i2 < A04; i2++) {
            User A002 = C70882OPz.A00(this.A01, pcn, r10, i2);
            if (A002 != null) {
                A1H.put(A002.getId(), AnonymousClass7TF.A0y(A002, nAs.mResultSet.getLong(i2, 4)));
            }
        }
        return A1H;
    }

    public final List BrM(int i) {
        CQLResultSet instagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative;
        String string;
        C297675s9 r1 = this.A00;
        ChildResultSetUtils childResultSetUtils = ChildResultSetUtils.sInstance;
        CQLResultSet cQLResultSet = r1.mResultSet;
        if (cQLResultSet instanceof JQLResultSet) {
            instagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative = ((JQLResultSet) cQLResultSet).A02("secure_thread_list_receipt_state_list", i);
        } else {
            instagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative = ChildResultSetUtils.getInstagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative((CQLResultSetImpl) cQLResultSet, i);
        }
        if (instagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative == null) {
            return 0sn.A00;
        }
        2HY A0C = C229632nm.A0C(0, instagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative.getCount());
        ArrayList A1C = AnonymousClass7TE.A1C();
        0sh it = A0C.iterator();
        while (it.hasNext()) {
            int A002 = it.A00();
            Long nullableLong = instagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative.getNullableLong(A002, 6);
            if (nullableLong != null) {
                long longValue = nullableLong.longValue();
                String string2 = instagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative.getString(A002, 2);
                if (!(string2 == null || (string = instagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative.getString(A002, 1)) == null)) {
                    A1C.add(new C70625ODw(string2, string, longValue));
                }
            }
        }
        return A1C;
    }

    public final String BxJ(int i) {
        return C66581MXm.A0v(this.A00, i);
    }

    public final long Bxc(int i) {
        return this.A00.mResultSet.getLong(i, 15);
    }

    public final Long C65(int i) {
        return C66581MXm.A0q(this.A00.mResultSet, i, 1);
    }

    public final int C67(int i) {
        return AnonymousClass7TG.A0A(this.A00.mResultSet.getNullableInteger(i, 8));
    }

    public final long C6J(int i) {
        return this.A00.mResultSet.getLong(i, 0);
    }

    public final String C6T(int i) {
        C297675s9 r2 = this.A00;
        String string = r2.mResultSet.getString(i, 3);
        if (string == null) {
            return C66581MXm.A0u(r2, i);
        }
        return string;
    }

    public final String C6V(int i) {
        return this.A00.mResultSet.getString(i, 4);
    }

    public final int C6j(int i) {
        return this.A00.mResultSet.getInteger(i, 23);
    }

    public final Integer CAu(int i) {
        return C66581MXm.A0o(this.A00.mResultSet, i, 44);
    }

    public final String CAv(int i) {
        return this.A00.mResultSet.getString(i, 43);
    }

    public final Integer CBl(int i) {
        return C66581MXm.A0o(this.A00.mResultSet, i, 19);
    }

    public final boolean CK9(int i) {
        return this.A00.mResultSet.getBoolean(i, 30);
    }

    public final boolean CR5(int i) {
        C297675s9 r3 = this.A00;
        String string = r3.mResultSet.getString(i, 41);
        if (string != null && string.length() != 0) {
            return true;
        }
        String string2 = r3.mResultSet.getString(i, 42);
        if (string2 == null || string2.length() == 0) {
            return false;
        }
        return true;
    }

    public final boolean CUL(int i) {
        return this.A00.mResultSet.getBoolean(i, 14);
    }

    public final boolean CXC(int i) {
        return AnonymousClass7TG.A1X(this.A00.mResultSet.getNullableBoolean(i, 46));
    }

    public final boolean CXv(int i) {
        return this.A00.mResultSet.getBoolean(i, 26);
    }

    public final boolean CXw(int i) {
        return this.A00.mResultSet.getBoolean(i, 27);
    }

    public final boolean Cdu(int i) {
        return this.A00.mResultSet.getBoolean(i, 25);
    }

    public final boolean CeK(int i) {
        return C66581MXm.A1V(this.A00.mResultSet.getInteger(i, 24));
    }

    public final int getCount() {
        return C66580MXl.A04(this.A00);
    }
}
