package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3QN  reason: invalid class name */
public final class AnonymousClass3QN {
    public static final MediaUploadMetadata A00(List list) {
        MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mediaUploadMetadata.A00((MediaUploadMetadata) it.next());
        }
        return mediaUploadMetadata;
    }

    public final String A01(List list) {
        0qQ.A0B(list, 0);
        String A00 = AnonymousClass000.A00(4619);
        if (list.contains(A00)) {
            return A00;
        }
        List A0X = 00k.A0X(list);
        ArrayList arrayList = new ArrayList();
        for (Object next : A0X) {
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        String str = (String) 00k.A0J(arrayList);
        if (str == null) {
            return (String) 00k.A0J(list);
        }
        return str;
    }
}
