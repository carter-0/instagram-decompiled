package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public final class LGF {
    public final 02m A00 = 02m.A0p;

    public LGF(UserSession userSession) {
        0qQ.A0B(userSession, 1);
    }

    public final void A03(C66460MSo mSo, C239803Ii r7) {
        int hashCode;
        02m r3;
        int i;
        short s;
        0qQ.A0B(r7, 1);
        if (r7 instanceof C239793Ih) {
            hashCode = mSo.BOI().hashCode();
            r3 = this.A00;
            i = 827064322;
            r3.markerPoint(827064322, hashCode, "value_load_end");
            s = 2;
        } else if (r7 instanceof C297815sO) {
            String obj = ((C297815sO) r7).A00.toString();
            0qQ.A0B(obj, 1);
            hashCode = mSo.BOI().hashCode();
            r3 = this.A00;
            i = 827064322;
            r3.markerPoint(827064322, hashCode, "value_load_end");
            r3.markerAnnotate(827064322, hashCode, "error_message", obj);
            s = 3;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r3.markerEnd(i, hashCode, s);
    }

    public final void A00(C66460MSo mSo) {
        0qQ.A0B(mSo, 0);
        int hashCode = mSo.BOI().hashCode();
        02m r2 = this.A00;
        r2.markerStart(827064323, hashCode);
        r2.markerAnnotate(827064323, hashCode, PublicKeyCredentialControllerUtility.JSON_KEY_ID, mSo.BOI());
    }

    public final void A01(C66460MSo mSo) {
        int hashCode = mSo.BOI().hashCode();
        02m r2 = this.A00;
        r2.markerStart(827064322, hashCode);
        r2.markerAnnotate(827064322, hashCode, PublicKeyCredentialControllerUtility.JSON_KEY_ID, mSo.BOI());
        r2.markerPoint(827064322, hashCode, "value_load_begin");
    }

    public final void A02(C66460MSo mSo, C239803Ii r7) {
        int hashCode;
        02m r3;
        int i;
        short s;
        boolean A1Z = AnonymousClass7TG.A1Z(mSo, r7);
        if (r7 instanceof C239793Ih) {
            hashCode = mSo.BOI().hashCode();
            r3 = this.A00;
            i = 827064323;
            s = 2;
        } else if (r7 instanceof C297815sO) {
            String obj = ((C297815sO) r7).A00.toString();
            0qQ.A0B(obj, A1Z ? 1 : 0);
            hashCode = mSo.BOI().hashCode();
            r3 = this.A00;
            i = 827064323;
            r3.markerAnnotate(827064323, hashCode, "error_message", obj);
            s = 3;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r3.markerEnd(i, hashCode, s);
    }
}
