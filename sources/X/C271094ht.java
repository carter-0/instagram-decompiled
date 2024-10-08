package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4ht  reason: invalid class name and case insensitive filesystem */
public abstract class C271094ht {
    public static final String A01(List list) {
        Long l;
        String str;
        if (list.isEmpty()) {
            return "empty";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        2UE r1 = null;
        String str2 = null;
        while (it.hasNext()) {
            2UE r8 = (2UE) it.next();
            if (r1 != null) {
                l = Long.valueOf(r1.A03.A00);
            } else {
                l = null;
            }
            String A03 = r8.A03(l);
            List A0R = 00l.A0R(A03, new String[]{","}, 0);
            if (str2 != null) {
                List A0R2 = 00l.A0R(str2, new String[]{","}, 0);
                if (A0R.size() >= 2 && A0R2.size() >= 2) {
                    if (0qQ.A0K(00k.A0c(A0R, 1), 00k.A0c(A0R2, 1))) {
                        str = 002.A0R((String) A0R.get(0), ", same above");
                    } else if (0qQ.A0K(A0R.get(1), A0R2.get(1))) {
                        str = 002.A0g((String) A0R.get(0), ", same action, ", 00k.A0P(", ", "", "", 00k.A0c(A0R, 2), (0sP) null));
                    }
                    arrayList.add(str);
                    str2 = A03;
                    r1 = r8;
                }
            }
            str = A03;
            arrayList.add(str);
            str2 = A03;
            r1 = r8;
        }
        return 00k.A0P("\n", "", "", arrayList, (0sP) null);
    }

    public static final String A00(List list) {
        int i;
        String obj;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof 2UG) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            2UG r1 = (2UG) next2;
            if (!r1.A02 && r1.A00 != null) {
                arrayList2.add(next2);
            }
        }
        ArrayList<2UI> arrayList3 = new ArrayList<>();
        for (Object next3 : list) {
            if (next3 instanceof 2UI) {
                arrayList3.add(next3);
            }
        }
        if (!arrayList2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i2 = 0;
                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((2UG) it.next()).A01 && (i2 = i2 + 1) < 0) {
                                break;
                            }
                        } else if (i2 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append('(');
                            sb3.append(i2);
                            sb3.append(" failed)");
                            obj = sb3.toString();
                        }
                    }
                    sb2.append(002.A05(size, "showed ", " Images", obj));
                }
                obj = "";
                sb2.append(002.A05(size, "showed ", " Images", obj));
            }
            String obj2 = sb2.toString();
            0qQ.A07(obj2);
            sb.append(obj2);
            sb.append(",");
        }
        if (!arrayList3.isEmpty()) {
            String str = "videos";
            StringBuilder sb4 = new StringBuilder();
            if (!arrayList3.isEmpty()) {
                if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                    i = 0;
                    for (2UI r0 : arrayList3) {
                        if (r0.A01 && (i = i + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    i = 0;
                }
                int size2 = arrayList3.size() - i;
                if (i > 0) {
                    if (i == 1) {
                        str = MediaStreamTrack.VIDEO_TRACK_KIND;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("played ");
                    sb5.append(i);
                    sb5.append(' ');
                    sb5.append(str);
                    sb5.append(',');
                    sb4.append(sb5.toString());
                }
                if (size2 > 0) {
                    sb4.append(002.A03(size2, " videos are loading,"));
                }
            }
            if (sb4.length() > 0) {
                sb4.deleteCharAt(sb4.length() - 1);
            }
            String obj3 = sb4.toString();
            0qQ.A07(obj3);
            sb.append(obj3);
            sb.append(",");
        }
        String obj4 = sb.toString();
        0qQ.A07(obj4);
        return obj4;
    }

    public static final JsonArray A02(List list) {
        JsonElement jsonLiteral;
        String str;
        JsonElement jsonElement;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            2UE r6 = (2UE) next;
            boolean z = false;
            if (i == 0) {
                z = true;
            }
            C271104hu r5 = new C271104hu();
            for (Map.Entry entry : r6.A04().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof List) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object A01 : (List) value) {
                        arrayList2.add(2UE.A01(A01));
                    }
                    jsonElement = new JsonArray(arrayList2);
                } else {
                    jsonElement = 2UE.A01(value);
                }
                r5.A01(str2, jsonElement);
            }
            Long valueOf = Long.valueOf((r6.A03.A00 - System.currentTimeMillis()) + SystemClock.uptimeMillis());
            SerialDescriptor serialDescriptor = C271114hv.A00;
            if (valueOf == null) {
                jsonLiteral = JsonNull.A00;
            } else {
                jsonLiteral = new JsonLiteral(valueOf, false);
            }
            r5.A01(TraceFieldType.StartTime, jsonLiteral);
            List<AnonymousClass475> list2 = r6.A05;
            if (!list2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (AnonymousClass475 r8 : list2) {
                    C271104hu r7 = new C271104hu();
                    int A00 = r8.A00();
                    if (A00 == 1) {
                        str = "network";
                    } else if (A00 == 2) {
                        str = MediaStreamTrack.VIDEO_TRACK_KIND;
                    } else if (A00 != 3) {
                        str = "unknown";
                    } else {
                        str = "image";
                    }
                    for (Map.Entry entry2 : 0Yt.A04(0se.A0M(new 0eP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str)), r8.A01()).entrySet()) {
                        r7.A01((String) entry2.getKey(), C271114hv.A05(entry2.getValue().toString()));
                    }
                    arrayList3.add(new JsonObject(r7.A00));
                }
                r5.A01("errors", new JsonArray(arrayList3));
            }
            List list3 = r6.A04;
            ArrayList<C271144hy> arrayList4 = new ArrayList<>();
            for (Object next2 : list3) {
                if (next2 instanceof C271144hy) {
                    arrayList4.add(next2);
                }
            }
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (C271144hy r0 : arrayList4) {
                    arrayList5.add(C271114hv.A05(r0.A00));
                }
                r5.A01("error_messages", new JsonArray(arrayList5));
            }
            AnonymousClass9IA r3 = r6.A02;
            AnonymousClass9IA r2 = r6.A01;
            if (!0qQ.A0K(r3, r2)) {
                r5.A01("app_environment_start", r3.A00());
                r5.A01("app_environment_end", r2.A00());
            } else if (z) {
                r5.A01("app_environment_start", r3.A00());
            }
            arrayList.add(new JsonObject(r5.A00));
            i = i2;
        }
        return new JsonArray(arrayList);
    }
}
