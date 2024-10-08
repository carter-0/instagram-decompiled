package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4kD  reason: invalid class name and case insensitive filesystem */
public abstract class C272154kD {
    public static AnonymousClass9J1 parseFromJson(16F r9) {
        String A1P;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str = null;
            ArrayList arrayList3 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            C279864zZ parseFromJson = B5T.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("prompt_notes_response_info".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            C61062Jw0 parseFromJson2 = C44286CcU.parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("ranking_session_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("stackable_prompt_ids".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            if (!(r9.A11() == 16L.A0G || (A1P = r9.A1P()) == null)) {
                                arrayList3.add(A1P);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                r9.A0z();
            }
            if (arrayList != null || !(r9 instanceof 0c9)) {
                return new AnonymousClass9J1(str, (List) arrayList, (List) arrayList2, (List) arrayList3);
            }
            ((0c9) r9).A03.A00(DialogModule.KEY_ITEMS, "NotesResponse");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
