package X;

import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.IOk  reason: case insensitive filesystem */
public final class C57096IOk implements AnonymousClass0lh {
    public static long A07 = -1;
    public LinkedList A00 = new LinkedList();
    public boolean A01;
    public final AnonymousClass0JR A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final boolean A05;
    public final List A06;

    private final synchronized C56497HzT A00(String str) {
        C56497HzT hzT;
        C54665HMw hMw = (C54665HMw) this.A03.get(str);
        if (hMw == null) {
            hzT = null;
        } else {
            hzT = (C56497HzT) this.A04.get(hMw);
        }
        return hzT;
    }

    private final synchronized void A01() {
        if (this.A05) {
            this.A00.clear();
        } else {
            this.A03.clear();
            for (C54665HMw put : C54665HMw.values()) {
                this.A04.put(put, new C56497HzT());
            }
        }
        this.A01 = false;
    }

    public final synchronized List A02(List list, List list2) {
        ArrayList A1C;
        IllegalArgumentException th;
        LinkedList<SavedCollection> linkedList;
        if (list == null) {
            C54665HMw[] values = C54665HMw.values();
            list = 0sr.A1P(Arrays.copyOf(values, values.length));
        }
        if (list2 == null) {
            HMU[] values2 = HMU.values();
            list2 = 0sr.A1P(Arrays.copyOf(values2, values2.length));
        }
        A1C = AnonymousClass7TE.A1C();
        if (this.A05) {
            for (SavedCollection savedCollection : this.A00) {
                HMU hmu = savedCollection.A06;
                if ((hmu == null || 00k.A0u(list2, hmu)) && list.contains(savedCollection.A07)) {
                    A1C.add(savedCollection);
                }
            }
        } else {
            for (C54665HMw hMw : this.A06) {
                if (list.contains(hMw)) {
                    Object obj = this.A04.get(hMw);
                    if (obj != null) {
                        C56497HzT hzT = (C56497HzT) obj;
                        synchronized (hzT) {
                            try {
                                linkedList = hzT.A00;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        for (SavedCollection savedCollection2 : linkedList) {
                            HMU hmu2 = savedCollection2.A06;
                            if (hmu2 == null || 00k.A0u(list2, hmu2)) {
                                A1C.add(savedCollection2);
                            }
                        }
                    } else {
                        th = DbU.A0h();
                        throw th;
                    }
                }
            }
        }
        return C51966G9m.A1J(A1C);
    }

    public final synchronized void A03(CollectionPrivacyModeEnum collectionPrivacyModeEnum, 1Xj r7, Integer num, String str, String str2) {
        IllegalArgumentException th;
        0qQ.A0B(str, 0);
        if (this.A05) {
            Iterator A1G = AnonymousClass7TE.A1G(this.A00);
            while (true) {
                if (!A1G.hasNext()) {
                    break;
                }
                SavedCollection savedCollection = (SavedCollection) AnonymousClass7TF.A0a(A1G);
                if (0qQ.A0K(savedCollection.A0F, str)) {
                    if (str2 != null) {
                        savedCollection.A0G = str2;
                    }
                    if (num != null) {
                        savedCollection.A0E = Integer.valueOf(num.intValue());
                    }
                    if (r7 != null) {
                        savedCollection.A0H = r7.getId();
                        savedCollection.A04 = r7;
                    }
                    if (collectionPrivacyModeEnum != null) {
                        savedCollection.A00 = collectionPrivacyModeEnum;
                    }
                    this.A00.remove(savedCollection);
                    this.A00.add(0, savedCollection);
                }
            }
        } else {
            C56497HzT A002 = A00(str);
            if (A002 != null) {
                if (str2 != null) {
                    synchronized (A002) {
                        int A003 = C56497HzT.A00(A002, str);
                        if (A003 != -1) {
                            LinkedList linkedList = A002.A00;
                            SavedCollection savedCollection2 = (SavedCollection) linkedList.get(A003);
                            if (savedCollection2 != null) {
                                try {
                                    savedCollection2.A0G = str2;
                                    if (num != null) {
                                        savedCollection2.A0E = Integer.valueOf(num.intValue());
                                    }
                                    if (r7 != null) {
                                        savedCollection2.A0H = r7.getId();
                                        savedCollection2.A04 = r7;
                                    }
                                    if (collectionPrivacyModeEnum != null) {
                                        savedCollection2.A00 = collectionPrivacyModeEnum;
                                    }
                                    linkedList.remove(savedCollection2);
                                    linkedList.add(0, savedCollection2);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                } else {
                    th = DbU.A0h();
                    throw th;
                }
            }
        }
    }

    public final synchronized void A04(SavedCollection savedCollection) {
        if (this.A05) {
            this.A00.addFirst(savedCollection);
        } else {
            this.A03.put(savedCollection.A0F, savedCollection.A07);
            C56497HzT hzT = (C56497HzT) this.A04.get(savedCollection.A07);
            if (hzT != null) {
                synchronized (hzT) {
                    hzT.A00.add(0, savedCollection);
                }
            }
        }
    }

    public final synchronized void A05(String str) {
        0qQ.A0B(str, 0);
        if (this.A05) {
            LinkedList linkedList = new LinkedList();
            for (SavedCollection savedCollection : this.A00) {
                if (!0qQ.A0K(savedCollection.A0F, str)) {
                    linkedList.add(savedCollection);
                }
            }
            this.A00 = linkedList;
        } else {
            C56497HzT A002 = A00(str);
            if (A002 != null) {
                synchronized (A002) {
                    int A003 = C56497HzT.A00(A002, str);
                    if (A003 != -1) {
                        A002.A00.remove(A003);
                    }
                }
                this.A03.remove(str);
            }
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:260)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:70)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final synchronized void A06(java.util.List r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            if (r10 == 0) goto L_0x0007
            r8.A01()     // Catch:{ all -> 0x00a4 }
        L_0x0007:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x00a4 }
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0028
            if (r11 == 0) goto L_0x0028
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1D(r9)     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = "my_favs"
            java.lang.String r2 = "Favorites"
            X.HMw r0 = X.C54665HMw.MEDIA     // Catch:{ all -> 0x00a4 }
            com.instagram.save.model.SavedCollection r1 = new com.instagram.save.model.SavedCollection     // Catch:{ all -> 0x00a4 }
            r1.<init>(r0, r4, r2)     // Catch:{ all -> 0x00a4 }
            com.instagram.api.schemas.CollectionPrivacyModeEnum r0 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PUBLIC     // Catch:{ all -> 0x00a4 }
            r1.A00 = r0     // Catch:{ all -> 0x00a4 }
            r9.add(r3, r1)     // Catch:{ all -> 0x00a4 }
        L_0x0028:
            java.util.Iterator r6 = r9.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x002c:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0098
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x00a4 }
            com.instagram.save.model.SavedCollection r4 = (com.instagram.save.model.SavedCollection) r4     // Catch:{ all -> 0x00a4 }
            boolean r5 = r8.A05     // Catch:{ all -> 0x00a4 }
            if (r5 == 0) goto L_0x0064
            java.util.LinkedList r1 = r8.A00     // Catch:{ all -> 0x00a4 }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0049
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0049
            goto L_0x006e
        L_0x0049:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x004d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00a4 }
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = r0.A0F     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x00a4 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x004d
            goto L_0x002c
        L_0x0064:
            java.util.concurrent.ConcurrentHashMap r1 = r8.A03     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x00a4 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x002c
        L_0x006e:
            if (r5 == 0) goto L_0x0076
            java.util.LinkedList r0 = r8.A00     // Catch:{ all -> 0x0096 }
            r0.add(r4)     // Catch:{ all -> 0x0096 }
            goto L_0x002c
        L_0x0076:
            java.util.concurrent.ConcurrentHashMap r2 = r8.A03     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r4.A0F     // Catch:{ all -> 0x0096 }
            X.HMw r0 = r4.A07     // Catch:{ all -> 0x0096 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0096 }
            java.util.concurrent.ConcurrentHashMap r1 = r8.A04     // Catch:{ all -> 0x0096 }
            X.HMw r0 = r4.A07     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0096 }
            X.HzT r1 = (X.C56497HzT) r1     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x002c
            monitor-enter(r1)     // Catch:{ all -> 0x0096 }
            java.util.LinkedList r0 = r1.A00     // Catch:{ all -> 0x0093 }
            r0.add(r4)     // Catch:{ all -> 0x0093 }
            monitor-exit(r1)     // Catch:{ all -> 0x0096 }
            goto L_0x002c
        L_0x0093:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x0098:
            X.0JR r0 = r8.A02     // Catch:{ all -> 0x00a4 }
            long r0 = r0.now()     // Catch:{ all -> 0x00a4 }
            A07 = r0     // Catch:{ all -> 0x00a4 }
            r8.A01 = r3     // Catch:{ all -> 0x00a4 }
            monitor-exit(r7)
            return
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57096IOk.A06(java.util.List, boolean, boolean):void");
    }

    public final synchronized boolean A07() {
        boolean z;
        int size;
        int size2;
        synchronized (this) {
            long now = this.A02.now();
            long j = A07;
            if (j != -1 && now >= j && now - j <= 120000) {
                if (this.A05) {
                    LinkedList linkedList = this.A00;
                    if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                        Iterator it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((SavedCollection) it.next()).A07 == C54665HMw.MEDIA) {
                                LinkedList linkedList2 = this.A00;
                                if (!(linkedList2 instanceof Collection) || !linkedList2.isEmpty()) {
                                    Iterator it2 = linkedList2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((SavedCollection) it2.next()).A07 == C54665HMw.ALL_MEDIA_AUTO_COLLECTION) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z = this.A01;
                    } else {
                        z = this.A01;
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = this.A04;
                    Object obj = concurrentHashMap.get(C54665HMw.MEDIA);
                    0qQ.A0A(obj);
                    C56497HzT hzT = (C56497HzT) obj;
                    synchronized (hzT) {
                        size = hzT.A00.size();
                    }
                    if (size > 0) {
                        Object obj2 = concurrentHashMap.get(C54665HMw.ALL_MEDIA_AUTO_COLLECTION);
                        0qQ.A0A(obj2);
                        C56497HzT hzT2 = (C56497HzT) obj2;
                        synchronized (hzT2) {
                            size2 = hzT2.A00.size();
                        }
                        if (size2 == 0) {
                        }
                    }
                    z = this.A01;
                }
            }
            A01();
            z = this.A01;
        }
        return z;
    }

    public C57096IOk(AnonymousClass0JR r7, UserSession userSession) {
        this.A02 = r7;
        boolean A062 = 182.A06(0Tu.A06, userSession, 36321185507779735L);
        this.A05 = A062;
        if (!A062) {
            for (C54665HMw put : C54665HMw.values()) {
                this.A04.put(put, new C56497HzT());
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(C54665HMw.SAVED_ENTRYPOINT_COLLECTION);
        A1C.add(C54665HMw.ALL_MEDIA_AUTO_COLLECTION);
        A1C.add(C54665HMw.PRODUCT_AUTO_COLLECTION);
        A1C.add(C54665HMw.LOCATIONS_AUTO_COLLECTION);
        A1C.add(C54665HMw.AUDIO_AUTO_COLLECTION);
        A1C.add(C54665HMw.LIKED_COLLECTIONS);
        A1C.add(C54665HMw.MEDIA);
        this.A06 = C51966G9m.A1J(A1C);
    }

    public final void onSessionWillEnd() {
        A01();
    }
}
