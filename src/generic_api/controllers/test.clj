(ns generic-api.controllers.test
  (:require [ring.util.response :as ring-resp]
            [io.pedestal.http.body-params :as body-params]
            [io.pedestal.http :as http]
            [generic-api.common.interceptors :refer [common-interceptors]]))

(defn home [request] (ring-resp/response {:response "Hola desde 1"}))

(defn routes [] #{["/test1" :get (conj common-interceptors `home)]})