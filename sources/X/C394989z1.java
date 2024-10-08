package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.ml.VisualFeatureStore;

/* renamed from: X.9z1  reason: invalid class name and case insensitive filesystem */
public abstract class C394989z1 {
    public static final VisualFeatureStore A00(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        VisualFeatureStore visualFeatureStore = VisualFeatureStore.A04;
        if (visualFeatureStore != null) {
            return visualFeatureStore;
        }
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        VisualFeatureStore visualFeatureStore2 = new VisualFeatureStore(applicationContext, userSession);
        VisualFeatureStore.A04 = visualFeatureStore2;
        return visualFeatureStore2;
    }
}
