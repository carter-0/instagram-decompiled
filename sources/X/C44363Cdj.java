package X;

import com.instagram.api.schemas.TrackDataImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cdj  reason: case insensitive filesystem */
public abstract class C44363Cdj {
    public static C53465Gox parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            TrackDataImpl trackDataImpl = null;
            Integer num = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("media_ids".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r12, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sound_sync_trim_time_ranges".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            BGU parseFromJson = C44364Cdk.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("track_data".equals(A17)) {
                    trackDataImpl = AnonymousClass3UP.parseFromJson(r12);
                } else {
                    num = C41847B3o.A13(r12, num, A17, "track_start_time");
                }
                r12.A0z();
            }
            if (arrayList == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_ids", r12, "SoundSyncInfo");
            } else if (arrayList2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sound_sync_trim_time_ranges", r12, "SoundSyncInfo");
            } else if (trackDataImpl == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("track_data", r12, "SoundSyncInfo");
            } else if (num != null || !(r12 instanceof 0c9)) {
                return new C53465Gox(trackDataImpl, arrayList, arrayList2, num.intValue());
            } else {
                AnonymousClass7TF.A1L("track_start_time", r12, "SoundSyncInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
