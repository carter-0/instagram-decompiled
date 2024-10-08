package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class OR2 {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.Gyv, X.NfY] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.Nfi, X.Mfb] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.Nfi, X.Mfb] */
    public static C69149NfY parseFromJson(16F r7) {
        ArrayList arrayList;
        Object obj;
        0qQ.A0B(r7, 0);
        try {
            ? gyv = new C54072Gyv();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (DialogModule.KEY_ITEMS.equals(A17)) {
                    ArrayList arrayList2 = null;
                    if (r7.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            JZC parseFromJson = C44955Cnp.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    gyv.A00 = arrayList2;
                } else {
                    C55140Hco.A00(r7, gyv, A17);
                }
                r7.A0z();
            }
            List<JZC> list = gyv.A00;
            if (list != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (JZC jzc : list) {
                    if (AnonymousClass7TF.A1V(jzc.A0F)) {
                        OriginalSoundData originalSoundData = jzc.A05;
                        if (originalSoundData != null) {
                            ? mfb = new C66942Mfb(7);
                            mfb.A00 = originalSoundData;
                            mfb.A03 = new DHT(originalSoundData);
                            obj = mfb;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        TrackDataImpl trackDataImpl = jzc.A08;
                        if (trackDataImpl != null) {
                            TrackMetadata trackMetadata = jzc.A0A;
                            if (trackMetadata != null) {
                                ? mfb2 = new C66942Mfb(7);
                                mfb2.A01 = trackDataImpl.FCv();
                                mfb2.A02 = trackMetadata.FCw();
                                JVX jvx = new JVX(trackDataImpl);
                                mfb2.A03 = jvx;
                                jvx.A00 = trackMetadata;
                                obj = mfb2;
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    arrayList.add(obj);
                }
            } else {
                arrayList = 0sn.A00;
            }
            0qQ.A0B(arrayList, 0);
            gyv.A09 = arrayList;
            return gyv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
