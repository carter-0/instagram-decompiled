package X;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Is  reason: invalid class name and case insensitive filesystem */
public final class C353698Is {
    public List A00;
    public boolean A01;
    public final Context A02;
    public final C353688Ir A03;
    public final AnonymousClass84O A04;
    public final AnonymousClass84N A05;

    public final List A00() {
        ArrayList arrayList;
        List list = this.A00;
        ArrayList arrayList2 = list;
        if (list == null) {
            if (this.A01) {
                arrayList = C9941Rju.A00;
            } else {
                Context context = this.A02;
                File file = new File(context.getFilesDir(), "concept_list_local_v1.classes");
                if (!file.exists()) {
                    try {
                        InputStream open = context.getAssets().open("concept_list.classes");
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = open.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                    } catch (IOException e) {
                        this.A03.Ew7("SceneUnderstandingResourceLoader", "Load concept list failed.", e);
                    }
                }
                String path = file.getPath();
                0qQ.A07(path);
                ArrayList arrayList3 = new ArrayList();
                try {
                    Iterator it = new AnonymousClass2U8(new 2U6(new BufferedReader(new FileReader(new File(path))))).iterator();
                    while (it.hasNext()) {
                        arrayList3.add(it.next());
                    }
                    arrayList = arrayList3;
                } catch (IOException e2) {
                    this.A03.Ew7("SceneUnderstandingResourceLoader", "Read concept list failed.", e2);
                    arrayList = arrayList3;
                }
            }
            this.A00 = arrayList;
            arrayList2 = arrayList;
        }
        if (arrayList2 != null) {
            return arrayList2;
        }
        0qQ.A0F("concepts");
        throw AnonymousClass00P.createAndThrow();
    }

    public C353698Is(Context context, C353688Ir r4, AnonymousClass84N r5) {
        this.A02 = context;
        this.A05 = r5;
        this.A03 = r4;
        this.A04 = new AnonymousClass84O(r5, "scene_understanding");
    }
}
