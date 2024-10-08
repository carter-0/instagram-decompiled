package com.facebook.proxygen;

public class HTTPRequestError {
    public ProxygenError mErrCode;
    public String mErrMsg;
    public HTTPRequestStage mErrStage;

    public enum HTTPRequestStage {
        ProcessRequest,
        DNSResolution,
        TCPConnection,
        TLSSetup,
        SendRequest,
        RecvResponse,
        Unknown,
        ZeroRttSent,
        WaitingRequest,
        RecvRequest,
        SendResponse,
        Max
    }

    public enum ProxygenError {
    }

    public ProxygenError getErrCode() {
        return this.mErrCode;
    }

    public String getErrMsg() {
        return this.mErrMsg;
    }

    public HTTPRequestStage getErrStage() {
        return this.mErrStage;
    }

    public HTTPRequestError(String str, HTTPRequestStage hTTPRequestStage, ProxygenError proxygenError) {
        this.mErrMsg = str;
        this.mErrStage = hTTPRequestStage;
        this.mErrCode = proxygenError;
    }
}
