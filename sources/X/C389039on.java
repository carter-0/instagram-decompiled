package X;

import android.content.ContentValues;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.ByteArrayOutputStream;

/* renamed from: X.9on  reason: invalid class name and case insensitive filesystem */
public final class C389039on extends 2PC {
    public final /* bridge */ /* synthetic */ ContentValues A0B(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A00.A06);
        contentValues.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0A(byteArrayOutputStream, obj));
        return contentValues;
    }

    public final String A0E() {
        return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
    }

    public final String A0F() {
        return "db_created_config";
    }

    public final /* bridge */ /* synthetic */ void A0G(17Z r4, Object obj) {
        Number number = (Number) obj;
        if (number != null) {
            synchronized (number) {
                try {
                    r4.A0c();
                    r4.A0Q("db_created_time", number.longValue());
                    r4.A0Z();
                    r4.close();
                } catch (Exception e) {
                    0wb.A06("DirectDatabaseCreatedConfigSQLiteTable", "Failed to serialize config", e);
                }
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ Object A0C(16F r4, boolean z) {
        try {
            r4.A1J();
            if (!"db_created_time".equals(r4.A0q())) {
                return null;
            }
            r4.A1J();
            return Long.valueOf(r4.A0j());
        } catch (Exception e) {
            0wb.A06("DirectDatabaseCreatedConfigSQLiteTable", "Failed to parse db config", e);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object A0D(UserSession userSession, Object obj) {
        return obj;
    }
}
