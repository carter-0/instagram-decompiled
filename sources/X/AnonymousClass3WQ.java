package X;

import com.instagram.api.schemas.DirectMediaFallbackUrlIntf;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediasize.VideoVersionIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3WQ  reason: invalid class name */
public abstract class AnonymousClass3WQ {
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, com.instagram.model.mediasize.VideoUrlImpl] */
    public static final ArrayList A00(List list) {
        VideoUrlImpl videoUrlImpl;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoVersionIntf videoVersionIntf = (VideoVersionIntf) it.next();
            if (!(videoVersionIntf == null || videoVersionIntf.getUrl() == null)) {
                DirectMediaFallbackUrlIntf B3l = videoVersionIntf.B3l();
                if (B3l != null) {
                    String url = B3l.getUrl();
                    String id = videoVersionIntf.getId();
                    Integer CGY = videoVersionIntf.CGY();
                    if (CGY != null) {
                        i4 = CGY.intValue();
                    } else {
                        i4 = -1;
                    }
                    Integer BCu = videoVersionIntf.BCu();
                    if (BCu != null) {
                        i5 = BCu.intValue();
                    } else {
                        i5 = -1;
                    }
                    Integer CAf = videoVersionIntf.CAf();
                    if (CAf != null) {
                        i6 = CAf.intValue();
                    } else {
                        i6 = -1;
                    }
                    videoUrlImpl = new VideoUrlImpl(url, i4, i5, i6, id);
                } else {
                    videoUrlImpl = null;
                }
                String url2 = videoVersionIntf.getUrl();
                String id2 = videoVersionIntf.getId();
                Integer CGY2 = videoVersionIntf.CGY();
                if (CGY2 != null) {
                    i = CGY2.intValue();
                } else {
                    i = -1;
                }
                Integer BCu2 = videoVersionIntf.BCu();
                if (BCu2 != null) {
                    i2 = BCu2.intValue();
                } else {
                    i2 = -1;
                }
                Integer CAf2 = videoVersionIntf.CAf();
                if (CAf2 != null) {
                    i3 = CAf2.intValue();
                } else {
                    i3 = -1;
                }
                Long CCK = videoVersionIntf.CCK();
                ? obj = new Object();
                if (url2 != null) {
                    obj.A06 = url2;
                    obj.A05 = id2;
                    obj.A02 = i;
                    obj.A00 = i2;
                    obj.A01 = i3;
                    obj.A04 = CCK;
                    obj.A03 = videoUrlImpl;
                    arrayList.add(obj);
                } else {
                    throw new RuntimeException("trying to created a VideoUrl object with null url");
                }
            }
        }
        return arrayList;
    }
}
