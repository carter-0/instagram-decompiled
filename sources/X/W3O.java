package X;

import android.content.Context;
import android.database.Cursor;
import android.database.StaleDataException;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class W3O {
    public static final X2M A0a = new WGN();
    public static final X2M A0b = new WGO();
    public static final Comparator A0c = new C13113TLw(4);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07 = -1;
    public String A08;
    public List A09;
    public Queue A0A;
    public Set A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public C14972UHq A0J = null;
    public C14973UHr A0K = null;
    public C14971UHp A0L = null;
    public String A0M;
    public final Context A0N;
    public final C17704VcZ A0O;
    public final VLJ A0P;
    public final C17790Vg2 A0Q;
    public final WGM A0R;
    public final C18031VkB A0S;
    public final X0Q A0T;
    public final S0I A0U;
    public final C18038VkM A0V;
    public final TelephonyManager A0W;
    public final C18553Vu5 A0X;
    public final C18443Vrm A0Y;
    public final C17337VRq A0Z;

    public static void A01(Bundle bundle, W3O w3o) {
        bundle.putBoolean("full_upload", false);
        bundle.putLong("last_upload_success_time", w3o.A0V.A00());
        C13989Tnp.A15(bundle, w3o);
        bundle.putString("ccu_session_id", w3o.A08);
        bundle.putString("source", w3o.A0M);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.VbF] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, X.Vb2] */
    /* JADX WARNING: type inference failed for: r0v81, types: [X.VLK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v82, types: [java.lang.Object, X.VLL] */
    public static void A03(C17652Vbi vbi, W3O w3o) {
        String str;
        String str2;
        String str3 = null;
        int i = vbi.A02;
        List<C17916Vi7> list = vbi.A06;
        ArrayList A0m = C51970G9q.A0m(list);
        for (C17916Vi7 vi7 : list) {
            Set set = vi7.A07;
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                ? obj = new Object();
                obj.A00 = A18;
                arrayList.add(obj);
            }
            Set set2 = vi7.A05;
            ArrayList arrayList2 = new ArrayList(set2.size());
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                String A182 = AnonymousClass7TE.A18(it2);
                ? obj2 = new Object();
                obj2.A00 = A182;
                arrayList2.add(obj2);
            }
            String A002 = SBC.A00(vi7.toString());
            A002.getClass();
            ? obj3 = new Object();
            obj3.A04 = vi7.A04;
            Integer num = vi7.A00;
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str2 = "REMOVE";
                        break;
                    case 2:
                        str2 = "UPDATE";
                        break;
                    default:
                        str2 = "ADD";
                        break;
                }
            } else {
                str2 = null;
            }
            obj3.A03 = str2;
            obj3.A00 = vi7.A02;
            obj3.A01 = vi7.A03;
            obj3.A06 = arrayList;
            obj3.A05 = arrayList2;
            obj3.A02 = A002;
            A0m.add(obj3);
        }
        String str4 = w3o.A08;
        if (str4 != null) {
            str3 = str4;
        } else {
            w3o.A0V.A01();
            w3o.A0P.A00.get();
            TelephonyManager telephonyManager = w3o.A0W;
            telephonyManager.getSimCountryIso();
            telephonyManager.getNetworkCountryIso();
        }
        int i2 = vbi.A01;
        int i3 = vbi.A05;
        int i4 = vbi.A04;
        Bundle bundle = new Bundle();
        bundle.putBoolean("full_upload", false);
        bundle.putInt("batch_index", i);
        bundle.putInt("batch_size", w3o.A0O.A00);
        bundle.putInt("contacts_upload_count", i2 + i3 + i4);
        bundle.putInt("add_count", i2);
        bundle.putInt("remove_count", i4);
        bundle.putInt("update_count", i3);
        bundle.putInt("processed_contact_count", vbi.A03);
        C13989Tnp.A15(bundle, w3o);
        bundle.putInt("num_of_retries", vbi.A00 ^ true ? 1 : 0);
        bundle.putString("ccu_session_id", w3o.A08);
        bundle.putString("family_device_id", (String) null);
        for (X9S DYp : w3o.A0Q.A01) {
            DYp.DYp(bundle);
        }
        C17337VRq vRq = w3o.A0Z;
        WGE wge = new WGE(bundle, vbi, w3o);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = A0m.iterator();
        while (it3.hasNext()) {
            C17610Vb2 vb2 = (C17610Vb2) it3.next();
            if (vb2 != null) {
                ? obj4 = new Object();
                obj4.A04 = vb2.A04;
                obj4.A00 = vb2.A00;
                obj4.A02 = vb2.A01;
                obj4.A05 = new ArrayList();
                List<VLK> list2 = vb2.A05;
                if (list2 != null) {
                    for (VLK vlk : list2) {
                        List list3 = obj4.A05;
                        if (list3 != null) {
                            String str5 = vlk.A00;
                            0qQ.A07(str5);
                            list3.add(str5);
                        }
                    }
                }
                obj4.A06 = new ArrayList();
                List<VLL> list4 = vb2.A06;
                if (list4 != null) {
                    for (VLL vll : list4) {
                        List list5 = obj4.A06;
                        if (list5 != null) {
                            String str6 = vll.A00;
                            0qQ.A07(str6);
                            list5.add(str6);
                        }
                    }
                }
                obj4.A01 = vb2.A02;
                obj4.A03 = vb2.A03;
                arrayList3.add(obj4);
            }
        }
        Context context = vRq.A00;
        UserSession userSession = vRq.A01;
        1NY A0a2 = AnonymousClass7TG.A0a(userSession);
        A0a2.A0A("address_book/merge_delta/");
        A0a2.A9m(Dbo.A01(0, 9, 117), 0qv.A02.A05(context));
        A0a2.A9m(Dbo.A00(), str3);
        A0a2.A0G("source", "ccu");
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
            A0A2.A0b();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C17623VbF vbF = (C17623VbF) it4.next();
                A0A2.A0c();
                String str7 = vbF.A04;
                if (str7 != null) {
                    A0A2.A0R("record_id", str7);
                }
                String str8 = vbF.A00;
                if (str8 != null) {
                    A0A2.A0R(Pxd.A00(215), str8);
                }
                String str9 = vbF.A02;
                if (str9 != null) {
                    A0A2.A0R("last_name", str9);
                }
                List list6 = vbF.A05;
                if (list6 != null) {
                    Iterator A0s = C41845B3m.A0s(A0A2, AnonymousClass000.A00(3048), list6);
                    while (A0s.hasNext()) {
                        C41846B3n.A18(A0A2, A0s);
                    }
                    A0A2.A0Y();
                }
                List list7 = vbF.A06;
                if (list7 != null) {
                    Iterator A0s2 = C41845B3m.A0s(A0A2, Pxd.A00(257), list7);
                    while (A0s2.hasNext()) {
                        C41846B3n.A18(A0A2, A0s2);
                    }
                    A0A2.A0Y();
                }
                String str10 = vbF.A01;
                if (str10 != null) {
                    A0A2.A0R("hash", str10);
                }
                String str11 = vbF.A03;
                if (str11 != null) {
                    A0A2.A0R("modifier", str11);
                }
                A0A2.A0Z();
            }
            A0A2.A0Y();
            A0A2.close();
            str = stringWriter.toString();
        } catch (IOException unused) {
            str = "";
        }
        A06(A0a2, userSession, "contacts", str);
        A0a2.A0Q(C15239UWz.class, C18189Vn3.class);
        A0a2.A0V = true;
        1OC A0M2 = A0a2.A0M();
        A0M2.A00 = new UYG(wge, userSession, 4);
        1ES.A03(A0M2);
    }

    private void A00() {
        C18038VkM vkM = this.A0V;
        vkM.A01();
        AnonymousClass0eK r13 = this.A0P.A00;
        String str = (String) r13.get();
        Bundle bundle = new Bundle();
        bundle.putBoolean("full_upload", false);
        bundle.putInt("total_batch_count", this.A0F);
        bundle.putInt("contacts_upload_count", this.A0I);
        bundle.putInt("add_count", this.A0E);
        bundle.putInt("remove_count", this.A0G);
        bundle.putInt("update_count", this.A0H);
        bundle.putInt("phonebook_size", this.A01);
        C17704VcZ vcZ = this.A0O;
        bundle.putLong("max_contacts_to_upload", (long) vcZ.A02);
        bundle.putLong("time_spent", System.currentTimeMillis() - this.A07);
        bundle.putInt("num_of_retries", vcZ.A03);
        bundle.putString("ccu_session_id", this.A08);
        bundle.putString("family_device_id", str);
        Set<X9S> set = this.A0Q.A01;
        for (X9S DYq : set) {
            DYq.DYq(bundle);
        }
        if (r13.get() != null) {
            r13.get();
        }
        C18031VkB vkB = this.A0S;
        vkB.A01("contacts_to_upload", String.valueOf(this.A0I));
        vkB.A01("batch_count", String.valueOf(this.A0F));
        vkB.A01("failed_batch_count", String.valueOf(this.A05));
        vkB.A00("close_connection");
        vkM.A02(System.currentTimeMillis());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("full_upload", false);
        bundle2.putLong("last_upload_success_time", vkM.A00());
        bundle2.putLong("time_spent", System.currentTimeMillis() - this.A07);
        bundle2.putInt("num_of_retries", vcZ.A03);
        bundle2.putString("ccu_session_id", this.A08);
        bundle2.putBoolean("in_sync", true);
        bundle2.putString("family_device_id", str);
        for (X9S D4G : set) {
            D4G.D4G(bundle2);
        }
        vkB.A02(true, "");
        this.A0D = false;
    }

    public static void A02(C17652Vbi vbi, W3O w3o) {
        w3o.A0B.remove(Integer.valueOf(vbi.A02));
        if (w3o.A0B.size() < w3o.A0O.A01 && !w3o.A0A.isEmpty()) {
            C17652Vbi vbi2 = (C17652Vbi) w3o.A0A.poll();
            w3o.A0B.add(Integer.valueOf(vbi2.A02));
            A03(vbi2, w3o);
        } else if (w3o.A0C && w3o.A0B.isEmpty() && w3o.A0A.isEmpty()) {
            w3o.A00();
        }
    }

    public static void A04(W3O w3o) {
        int i;
        W3O w3o2 = w3o;
        w3o2.A0S.A00("upload_contacts");
        C17704VcZ vcZ = w3o2.A0O;
        w3o2.A0B = Collections.synchronizedSet(new HashSet(vcZ.A01));
        w3o2.A0A = new ConcurrentLinkedQueue();
        w3o2.A0C = false;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = vcZ.A00;
            int i3 = 0;
            int i4 = 0;
            while (w3o2.A0L.hasNext()) {
                try {
                    C17300VQb vQb = (C17300VQb) w3o2.A0L.next();
                    C17916Vi7 vi7 = (C17916Vi7) vQb.A00;
                    VUY vuy = (VUY) vQb.A01;
                    if (vi7 == null) {
                        vi7 = new C17916Vi7(002.A0Q("", vuy.A01));
                        vi7.A00 = AnonymousClass05K.A01;
                        vuy.A00 = AnonymousClass05K.A0C;
                        w3o2.A03++;
                    } else {
                        if (vuy == null) {
                            int i5 = w3o2.A01 + 1;
                            w3o2.A01 = i5;
                            if (i5 <= vcZ.A02) {
                                Integer num = AnonymousClass05K.A00;
                                vi7.A00 = num;
                                long parseLong = Long.parseLong(vi7.A04);
                                String A002 = SBC.A00(vi7.toString());
                                A002.getClass();
                                vuy = new VUY(parseLong, A002);
                                vuy.A00 = num;
                                w3o2.A00++;
                            }
                        } else {
                            int i6 = w3o2.A01 + 1;
                            w3o2.A01 = i6;
                            if (i6 > vcZ.A02) {
                                vi7 = new C17916Vi7(002.A0Q("", vuy.A01));
                                vi7.A00 = AnonymousClass05K.A01;
                                vuy.A00 = AnonymousClass05K.A0C;
                                w3o2.A03++;
                            } else {
                                String A003 = SBC.A00(vi7.toString());
                                A003.getClass();
                                if (!A003.equals(vuy.A02)) {
                                    vi7.A00 = AnonymousClass05K.A0C;
                                    long parseLong2 = Long.parseLong(vi7.A04);
                                    String A004 = SBC.A00(vi7.toString());
                                    A004.getClass();
                                    vuy = new VUY(parseLong2, A004);
                                    vuy.A00 = AnonymousClass05K.A01;
                                    w3o2.A06++;
                                }
                            }
                        }
                        w3o2.A02++;
                    }
                    if (!AnonymousClass05K.A01.equals(vi7.A00)) {
                        List list = w3o2.A09;
                        String A005 = SBC.A00(vi7.toString());
                        A005.getClass();
                        list.add(A005);
                    }
                    if (vi7.A00 != null) {
                        arrayList.add(vi7);
                        arrayList2.add(vuy);
                        i3++;
                        if (i3 >= i2) {
                            C17652Vbi vbi = new C17652Vbi(Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2), i4, w3o2.A00, w3o2.A06, w3o2.A03, w3o2.A02);
                            if (w3o2.A0B.size() < vcZ.A01) {
                                w3o2.A0B.add(Integer.valueOf(i4));
                                A03(vbi, w3o2);
                            } else {
                                w3o2.A0A.add(vbi);
                            }
                            i4++;
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList();
                            w3o2.A0E += w3o2.A00;
                            w3o2.A00 = 0;
                            w3o2.A0G += w3o2.A03;
                            w3o2.A03 = 0;
                            w3o2.A0H += w3o2.A06;
                            w3o2.A06 = 0;
                            i3 = 0;
                        }
                    }
                } catch (StaleDataException | IllegalArgumentException | IllegalStateException | NullPointerException unused) {
                }
            }
            if (i3 > 0) {
                i = i4;
                C17652Vbi vbi2 = new C17652Vbi(Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2), i4, w3o2.A00, w3o2.A06, w3o2.A03, w3o2.A02);
                if (w3o2.A0B.size() < vcZ.A01) {
                    w3o2.A0B.add(Integer.valueOf(i4));
                    A03(vbi2, w3o2);
                } else {
                    w3o2.A0A.add(vbi2);
                }
                w3o2.A0E += w3o2.A00;
                w3o2.A0G += w3o2.A03;
                w3o2.A0H += w3o2.A06;
                i4++;
            } else {
                i = i4;
            }
            w3o2.A0F = i4;
            w3o2.A0C = true;
            w3o2.A0I = w3o2.A0E + w3o2.A0G + w3o2.A0H;
            C18038VkM vkM = w3o2.A0V;
            List list2 = w3o2.A09;
            Collections.sort(list2);
            String A006 = SBC.A00(TextUtils.join(":", list2));
            0qQ.A0B(A006, 0);
            String str = vkM.A01.A06;
            0xY AR4 = vkM.A02.AR4();
            AR4.E5g(002.A0R(str, "last_upload_client_root_hash"), A006);
            AR4.apply();
            if (i3 == 0 && i == 0) {
                w3o2.A00();
            }
        } finally {
            w3o2.A0J.close();
            w3o2.A0K.close();
        }
    }

    public static void A05(W3O w3o, VLM vlm, List list, int i) {
        w3o.A0S.A00("open_connection");
        C17337VRq vRq = w3o.A0Z;
        WGF wgf = new WGF(w3o, vlm, list, i);
        0qQ.A0B(vlm, 0);
        Context context = vRq.A00;
        UserSession userSession = vRq.A01;
        String str = vlm.A00;
        1NY A0a2 = AnonymousClass7TG.A0a(userSession);
        A0a2.A0A("address_book/get_contact_hashes/");
        A0a2.A9m(Dbo.A01(0, 9, 117), 0qv.A02.A05(context));
        A06(A0a2, userSession, "address_book_hash", str);
        A0a2.A0Q(C15250UXk.class, C18188Vn2.class);
        A0a2.A0V = true;
        1OC A0M2 = A0a2.A0M();
        A0M2.A00 = new UYG(wgf, userSession, 3);
        1ES.A03(A0M2);
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.Object, X.VLM] */
    public final void A07() {
        C14973UHr uHr;
        C14972UHq uHq;
        C18031VkB vkB = this.A0S;
        vkB.A00("instantiate_iterators");
        vkB.A01("full_upload", String.valueOf(false));
        vkB.A01("upload_source", "CCU_BACKGROUND_PING");
        this.A0D = true;
        this.A07 = System.currentTimeMillis();
        this.A0M = "CCU_BACKGROUND_PING";
        this.A08 = null;
        VLJ vlj = this.A0P;
        Bundle bundle = new Bundle();
        bundle.putString("source", "CCU_BACKGROUND_PING");
        bundle.putBoolean("full_upload", false);
        bundle.putString("family_device_id", (String) null);
        C17790Vg2 vg2 = this.A0Q;
        Set<X9S> set = vg2.A01;
        for (X9S DYs : set) {
            DYs.DYs(bundle);
        }
        this.A09 = new ArrayList();
        C18553Vu5 vu5 = this.A0X;
        this.A0J = vu5.A00();
        C18443Vrm vrm = this.A0Y;
        try {
            Cursor query = ((Q6S) vrm.A01).getWritableDatabase().query(Pxd.A00(203), C18443Vrm.A02, (String) null, (String[]) null, (String) null, (String) null, "local_contact_id");
            try {
                uHr = new C14973UHr(query);
            } catch (Exception unused) {
                if (query != null) {
                    query.close();
                }
            }
        } catch (Exception unused2) {
            Bundle bundle2 = new Bundle(1);
            bundle2.putString(TraceFieldType.FailureReason, "snapshot_iterator_cursor_null");
            vrm.A00.A00(bundle2);
            uHr = null;
            this.A0K = uHr;
            uHq = this.A0J;
            int i = 0;
            if (uHq != null) {
            }
            this.A0D = false;
            Bundle bundle3 = new Bundle();
            bundle3.putString(TraceFieldType.FailureReason, "create_session_get_iterator_fail");
            bundle3.putString("family_device_id", (String) null);
            vg2.A00(bundle3);
            vkB.A02(true, "Cant create iterator, os permission may be off");
            return;
        }
        this.A0K = uHr;
        uHq = this.A0J;
        int i2 = 0;
        if (uHq != null || uHr == null) {
            this.A0D = false;
            Bundle bundle32 = new Bundle();
            bundle32.putString(TraceFieldType.FailureReason, "create_session_get_iterator_fail");
            bundle32.putString("family_device_id", (String) null);
            vg2.A00(bundle32);
            vkB.A02(true, "Cant create iterator, os permission may be off");
            return;
        }
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = 0;
        this.A0E = 0;
        this.A0G = 0;
        this.A0H = 0;
        this.A0F = 0;
        this.A0I = 0;
        this.A05 = 0;
        this.A01 = 0;
        this.A02 = 0;
        C17704VcZ vcZ = this.A0O;
        this.A04 = vcZ.A03;
        this.A0L = new C14971UHp(A0a, A0b, A0c, uHq, uHr);
        String A012 = this.A0V.A01();
        ? obj = new Object();
        obj.A00 = A012;
        vlj.A00.get();
        TelephonyManager telephonyManager = this.A0W;
        telephonyManager.getSimCountryIso();
        telephonyManager.getNetworkCountryIso();
        ArrayList arrayList = new ArrayList();
        vkB.A00("read_address_book");
        C14972UHq uHq2 = this.A0J;
        if (uHq2 == null || uHq2.A00.isClosed()) {
            C14972UHq A002 = vu5.A00();
            this.A0J = A002;
            Cursor cursor = A002.A00;
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("deleted");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("contact_id");
            long j = -1;
            i2 = 0;
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndexOrThrow) == 0) {
                    long j2 = cursor.getLong(columnIndexOrThrow2);
                    if (j2 != j) {
                        i2++;
                        j = j2;
                    }
                }
            }
            cursor.moveToPosition(position);
        }
        vkB.A01("contacts_count", String.valueOf(i2));
        Bundle bundle4 = new Bundle();
        bundle4.putBoolean("full_upload", false);
        bundle4.putString("source", this.A0M);
        bundle4.putInt("batch_size", vcZ.A00);
        bundle4.putInt("num_of_retries", this.A04);
        bundle4.putInt("contacts_upload_count", this.A0E);
        C13989Tnp.A15(bundle4, this);
        bundle4.putInt("phonebook_size", i2);
        bundle4.putString("family_device_id", (String) null);
        for (X9S Dmf : set) {
            Dmf.Dmf(bundle4);
        }
        A05(this, obj, Collections.unmodifiableList(arrayList), 0);
    }

    public final void A08(int i, String str, String str2, long j) {
        1OC A002;
        UYG uyg;
        this.A0N.checkCallingOrSelfPermission("android.permission.READ_CONTACTS");
        this.A0P.A00.get();
        C17337VRq vRq = this.A0Z;
        String str3 = str2;
        WGG wgg = new WGG(this, str3, str, i, j);
        int hashCode = str3.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935 && str3.equals("off")) {
                Context context = vRq.A00;
                UserSession userSession = vRq.A01;
                A002 = FGQ.A01(context, userSession, "remote_setting_migration", true);
                uyg = new UYG(wgg, userSession, 2);
            } else {
                return;
            }
        } else if (str3.equals("on")) {
            Context context2 = vRq.A00;
            UserSession userSession2 = vRq.A01;
            A002 = FGQ.A00(context2, userSession2, "[]", "ig_ccu_background_job", "remote_setting_migration", false, false);
            uyg = new UYG(wgg, userSession2, 1);
        } else {
            return;
        }
        A002.A00 = uyg;
        1ES.A03(A002);
    }

    public final void A09(long j) {
        C18031VkB vkB = this.A0S;
        vkB.A00("check_remote_setting");
        vkB.A01("upload_source", "CCU_BACKGROUND_PING");
        this.A0R.A05("background_job_new_protocol_remote_setting", "get_remote_settng", (String) null, (String) null);
        C17337VRq vRq = this.A0Z;
        WGD wgd = new WGD(this, j);
        Context context = vRq.A00;
        UserSession userSession = vRq.A01;
        1NY A0b2 = AnonymousClass7TG.A0b(userSession);
        A0b2.A0A("address_book/get_ccu_setting/");
        A06(A0b2, userSession, Dbo.A01(0, 9, 117), 0qv.A02.A05(context));
        A0b2.A0Q(UXF.class, C18187Vn1.class);
        A0b2.A0V = true;
        1OC A0M2 = A0b2.A0M();
        A0M2.A00 = new UYG(wgd, userSession, 0);
        1ES.A03(A0M2);
    }

    public W3O(Context context, C17704VcZ vcZ, VLJ vlj, C17790Vg2 vg2, WGM wgm, C18031VkB vkB, C18038VkM vkM, C17337VRq vRq) {
        this.A0P = vlj;
        this.A0N = context;
        this.A0V = vkM;
        this.A0O = vcZ;
        this.A0Z = vRq;
        this.A0Q = vg2;
        this.A0R = wgm;
        this.A0W = (TelephonyManager) context.getSystemService("phone");
        this.A0X = new C18553Vu5(context, vg2);
        Q6S q6s = new Q6S(context);
        this.A0T = q6s;
        this.A0U = new S0I(q6s);
        this.A0Y = new C18443Vrm(vg2, q6s);
        this.A0S = vkB;
    }

    public static void A06(1Fa r2, 0lg r3, String str, String str2) {
        r2.A9m(str, str2);
        r2.A0G("phone_id", 0jh.A04.A01(r3).A02(19f.A1Y));
    }
}
