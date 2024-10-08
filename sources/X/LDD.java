package X;

import android.util.Base64;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public final class LDD {
    public C63774L6g A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = MMJ.A00(this, 0eO.A02, 38);

    public LDD(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final C63774L6g A00() {
        C61261Jzt jzt;
        C63774L6g l6g = this.A00;
        if (l6g == null) {
            String string = ((0xa) this.A02.getValue()).getString("igsignals_ttnc_estimator_metadata_v1.0", (String) null);
            if (string != null) {
                try {
                    Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 0))).readObject();
                    if ((readObject instanceof C61261Jzt) && (jzt = (C61261Jzt) readObject) != null) {
                        List list = jzt.A01;
                        list.size();
                        l6g = new C63774L6g(jzt.A00, list);
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
                l6g = new C63774L6g((C61262Jzu) null, 0sn.A00);
            } else {
                l6g = new C63774L6g((C61262Jzu) null, 0sn.A00);
            }
            this.A00 = l6g;
        }
        return l6g;
    }
}
