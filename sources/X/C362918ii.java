package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8ii  reason: invalid class name and case insensitive filesystem */
public final class C362918ii extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ StoryDraftsStore A02;
    public final /* synthetic */ Set A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C362918ii(Context context, StoryDraftsStore storyDraftsStore, Set set, long j, boolean z) {
        super(825, 3, false, false);
        this.A03 = set;
        this.A02 = storyDraftsStore;
        this.A04 = z;
        this.A00 = j;
        this.A01 = context;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        for (String A012 : 00k.A0X(this.A03)) {
            try {
                C369988ve parseFromJson = C369978vd.parseFromJson(0c9.A04.A01(this.A02.A01, A012));
                C363928ka A002 = parseFromJson.A00();
                if (A002 == null || A002.A03()) {
                    if (this.A04) {
                        long j = this.A00;
                        long currentTimeMillis = System.currentTimeMillis();
                        long j2 = parseFromJson.A00;
                        if (j < j2) {
                            j = j2;
                        }
                        if (currentTimeMillis - j > 604800000) {
                            0tS A003 = 0tS.A4E.A00();
                            if (!((Boolean) A003.A2J.CDM(A003, 0tS.A4G[86])).booleanValue()) {
                            }
                        }
                    }
                    arrayList.add(parseFromJson);
                }
            } catch (IOException e) {
                0kD.A0F("StoryDraftsStore", "Failed to de-serialise story draft", e);
            }
        }
        StoryDraftsStore storyDraftsStore = this.A02;
        11Z.A02(new C370238w3(storyDraftsStore, arrayList));
        Context context = this.A01;
        UserSession userSession = storyDraftsStore.A01;
        0qQ.A0B(context, 0);
        C370248w4 r3 = (C370248w4) userSession.A01(C370248w4.class, new C66291MMa(1, context, userSession));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C369988ve) it.next()).A07;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Set A0k = 00k.A0k(arrayList2);
        0qQ.A0B(r3, 0);
        File[] listFiles = r3.A00.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory() && !A0k.contains(file.getName())) {
                    AnonymousClass5Kg.A07(file);
                }
            }
        }
    }
}
