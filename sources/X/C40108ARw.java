package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceContent;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ARw  reason: case insensitive filesystem */
public final class C40108ARw implements GalleryPickerServiceDataSource, C41801B1g {
    public final List A00 = AnonymousClass7TE.A1C();

    public final List EzQ(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("commandType") && bundle.getInt("commandType") == 0 && bundle.containsKey("filePaths") && bundle.containsKey("orientations") && bundle.containsKey("isPhotoBooleans")) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("orientations");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("filePaths");
            boolean[] booleanArray = bundle.getBooleanArray("isPhotoBooleans");
            if (!(integerArrayList == null || stringArrayList == null || booleanArray == null)) {
                ArrayList arrayList = new ArrayList(r2);
                for (boolean valueOf : booleanArray) {
                    arrayList.add(Boolean.valueOf(valueOf));
                }
                int size = integerArrayList.size();
                if (stringArrayList.size() == size && arrayList.size() == size) {
                    List list = this.A00;
                    list.clear();
                    for (int i = 0; i < size; i++) {
                        list.add(new GalleryPickerServiceContent(AnonymousClass7TE.A0M(integerArrayList.get(i)), stringArrayList.get(i), AnonymousClass7TE.A1a(arrayList.get(i))));
                    }
                }
            }
        }
        return null;
    }

    public final void setGalleryPickerContentListener(C40715Ahk ahk) {
    }

    public final void setGalleryPickerServiceListener(AnonymousClass9YT r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final List getContent() {
        List unmodifiableList = Collections.unmodifiableList(this.A00);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }
}
