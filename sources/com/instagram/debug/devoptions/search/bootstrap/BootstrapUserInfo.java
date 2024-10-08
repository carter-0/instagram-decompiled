package com.instagram.debug.devoptions.search.bootstrap;

import X.01V;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C293645l7;
import X.DbV;
import X.JTO;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BootstrapUserInfo {
    public static final Companion Companion = new Object();
    public int rank;
    public final Map surfaceToScoreMap = new HashMap();
    public final User user;

    public BootstrapUserInfo(User user2) {
        0qQ.A0B(user2, 1);
        this.user = user2;
    }

    public static final List generateInfosForSurface(Map map, C293645l7 r2, List list) {
        return Companion.generateInfosForSurface(map, r2, list);
    }

    public final void putScore(String str, double d) {
        0qQ.A0B(str, 0);
        this.surfaceToScoreMap.put(str, Double.valueOf(d));
    }

    public final class Companion {
        public final List generateInfosForSurface(Map map, C293645l7 r11, List list) {
            AnonymousClass7TG.A1T(map, r11, list);
            ArrayList arrayList = new ArrayList();
            Map map2 = r11.A03;
            if (map2 == null) {
                map2 = Collections.emptyMap();
            }
            Iterator A16 = DbV.A16(map2);
            while (A16.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A16);
                User user = (User) map.get(A18);
                if (user == null) {
                    user = new User(A18, "[Not in Bootstrap User List]");
                }
                arrayList.add(new BootstrapUserInfo(user));
            }
            01V.A1D(arrayList, new BootstrapUserInfo$sam$java_util_Comparator$0(new BootstrapUserInfo$Companion$generateInfosForSurface$1(r11)));
            int i = 0;
            int size = arrayList.size();
            while (i < size) {
                BootstrapUserInfo bootstrapUserInfo = (BootstrapUserInfo) arrayList.get(i);
                i++;
                bootstrapUserInfo.rank = i;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C293645l7 r3 = (C293645l7) it.next();
                        String id = bootstrapUserInfo.user.getId();
                        Map map3 = r3.A03;
                        if (map3 == null) {
                            map3 = Collections.emptyMap();
                        }
                        if (map3.containsKey(id)) {
                            String str = r3.A01;
                            0qQ.A07(str);
                            Map map4 = r3.A03;
                            if (map4 == null) {
                                map4 = Collections.emptyMap();
                            }
                            Object obj = map4.get(id);
                            if (obj != null) {
                                bootstrapUserInfo.putScore(str, JTO.A00(obj));
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final int getRank() {
        return this.rank;
    }

    public final Map getScores() {
        return this.surfaceToScoreMap;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setRank(int i) {
        this.rank = i;
    }
}
