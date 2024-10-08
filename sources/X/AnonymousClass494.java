package X;

import android.content.ContentValues;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: X.494  reason: invalid class name */
public final class AnonymousClass494 extends 2PC {
    public final String A0E() {
        return "mutation";
    }

    public final String A0F() {
        return "mutations";
    }

    public final /* bridge */ /* synthetic */ ContentValues A0B(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        1OS r5 = (1OS) obj;
        0qQ.A0B(r5, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A00.A06);
        contentValues.put("mutation_type", r5.A02());
        contentValues.put("mutation", A0A(byteArrayOutputStream, r5));
        return contentValues;
    }

    public final /* bridge */ /* synthetic */ Object A0C(16F r4, boolean z) {
        try {
            1OS A01 = AnonymousClass1Ov.A00.A01(r4);
            if (A01 == null) {
                return null;
            }
            if (!"executing".equals(A01.A06)) {
                return A01;
            }
            A01.A06 = "queued";
            return A01;
        } catch (IOException e) {
            0wb.A06("DirectMutationSQLiteTable", "Error parsing json string into DirectMutation.", e);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void A0G(17Z r2, Object obj) {
        1OS r3 = (1OS) obj;
        0qQ.A0B(r3, 1);
        AnonymousClass1Ov.A00.A02(r2, r3);
    }

    public final /* bridge */ /* synthetic */ Object A0D(UserSession userSession, Object obj) {
        return obj;
    }
}
