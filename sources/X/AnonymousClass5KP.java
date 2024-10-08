package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.core.PreferencesSerializer;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5KP  reason: invalid class name */
public final class AnonymousClass5KP {
    public static final AnonymousClass5KP A00 = new Object();

    public static /* synthetic */ AnonymousClass5KY A00(AnonymousClass5KJ r8, 0sn r9, C62320sa r10, int i) {
        Object obj = r8;
        AnonymousClass19S r82 = null;
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            r9 = 0sn.A00;
        }
        if ((i & 4) != 0) {
            r82 = 19E.A02(AnonymousClass199.A02(AnonymousClass12W.A01, new AnonymousClass19G((C262204Co) null)));
        }
        0qQ.A0B(r9, 1);
        0qQ.A0B(r82, 2);
        PreferencesSerializer preferencesSerializer = PreferencesSerializer.A00;
        AnonymousClass9L8 r7 = new AnonymousClass9L8(r10, 43);
        0qQ.A0B(preferencesSerializer, 0);
        if (obj == null) {
            obj = new Object();
        }
        List singletonList = Collections.singletonList(new AnonymousClass9K3((Object) r9, (AnonymousClass4D7) null, 6, 42));
        0qQ.A07(singletonList);
        return new AnonymousClass5KY(new SingleProcessDataStore((AnonymousClass5KK) obj, preferencesSerializer, singletonList, r7, r82));
    }
}
