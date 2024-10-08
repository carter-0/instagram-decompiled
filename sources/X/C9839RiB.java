package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.RiB  reason: case insensitive filesystem */
public abstract class C9839RiB {
    public static HashMap A00(AnonymousClass3Q2 r4, Q1Q q1q) {
        ClipInfo clipInfo = r4.A1N;
        String str = clipInfo.A0F;
        if (str == null) {
            0wb.A04("VideoFilePath is null in StitchedClipInfo", AnonymousClass7TG.A0m(clipInfo, "clip info: ", AnonymousClass7TE.A1A()), 100);
            str = "";
        }
        String str2 = r4.A3t;
        0qQ.A0B(str2, 1);
        HashMap A00 = new S31((MediaComposition) null, str2, str, (Map) null).A00();
        A00.put("video_asset_id_list", Pxe.A1E().put(C9610Rdo.A00(str)).toString());
        A00.put("media_type", C66582MXn.A0w(r4.A07().toString()));
        A00.put("source_type", C59906JbV.A01(q1q.A00, r4));
        return A00;
    }
}
