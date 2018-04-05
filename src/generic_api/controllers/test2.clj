(ns generic-api.controllers.test2
  (:require [ring.util.response :as ring-resp]
            [io.pedestal.http.body-params :as body-params]
            [io.pedestal.http :as http]
            [generic-api.common.interceptors :refer [common-interceptors]]))

(defn home [request] (ring-resp/response {:response "Hola desde 2"}))

(defn routes [] #{["/test2" :get (conj common-interceptors `home)]})